package com.lzx.lcn.pay.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.lzx.lcn.pay.client.FeignOrderClient;
import com.lzx.lcn.pay.mapper.PayTableMapper;
import com.lzx.lcn.pay.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PayServiceImpl implements IPayService {

    /**
     * 1、发起方pom文件引入lcn的jar包
     * 2、以及druid的jar包（数据库代理服务）
     * 3、配置mapper的扫描包
     * 4、在配置文件中添加tx-manager的地址（通讯用）
     * 5、启动类中添加数据源代理
     * 6、添加与tx-manager用的通讯模块
     * 7、发起方业务方法上添加@TxTranscation(isStart=true)注解
     */
    private PayTableMapper payTableMapper;

    private FeignOrderClient feignOrderClient;

    @Autowired
    public void setPayTableMapper(PayTableMapper payTableMapper) {
        this.payTableMapper = payTableMapper;
    }

    @Autowired
    public void setFeignOrderClient(FeignOrderClient feignOrderClient) {
        this.feignOrderClient = feignOrderClient;
    }

    //lcn全局事务管理器的发起方法，想tm发起全局事务管理的请求
    @Override
    @Transactional
    @TxTransaction(isStart = true)
    public Integer updatePayTable(Integer id, Byte isPay) {
        Integer status;
        status = payTableMapper.update(id, isPay);

        System.out.println("更新pay_table成功，受影响条数为：" + status);

        //通过feign远程调用order的保存订单方法
        status = feignOrderClient.updateOrder();

        //测试用例：此处出现异常，分布式系统两边的事务回滚
        //int i = 1/0;

        return status;
    }

}
