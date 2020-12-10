package com.lzx.lcn.order.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.lzx.lcn.order.mapper.OrderTableMapper;
import com.lzx.lcn.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements IOrderService {

    /**
     * 1、事务参与方注入订单表的mapper
     * 2、更新订单表
     * 3、开启本地事务
     * 4、整合lcn框架，实现分布式事务，加入tc模块，加入lcn的jar包
     * 4.1、与tm通信，需要通信模块
     * 4.2、接管数据源
     * 4.3、添加lcn注解，开启分布式事务
     */
    private OrderTableMapper orderTableMapper;

    @Autowired
    public void setOrderTableMapper(OrderTableMapper orderTableMapper) {
        this.orderTableMapper = orderTableMapper;
    }

    //开启lcn全局事务管理
    @Override
    @Transactional
    @TxTransaction
    public Integer updateOrder() {
        Integer result = orderTableMapper.update(1111, (byte)1);
        System.out.println("更新已完成，受影响的数据行数为：" + result + "条");
        return 0;
    }

}
