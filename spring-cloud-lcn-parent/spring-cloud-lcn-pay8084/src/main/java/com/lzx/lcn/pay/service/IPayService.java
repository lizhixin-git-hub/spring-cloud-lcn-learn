package com.lzx.lcn.pay.service;

public interface IPayService {

    //更新支付表中的状态，同时调用远程的Order服务，更新订单状态
    Integer updatePayTable(Integer id, Byte isPay);

}
