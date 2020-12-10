package com.lzx.lcn.pay.controller;

import com.lzx.lcn.pay.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/pay")
public class PayController {

    private IPayService payService;

    @Autowired
    public void setPayService(IPayService payService) {
        this.payService = payService;
    }

    @RequestMapping("/updateOrder/{payId}/{isPay}")
    public String payOrder(@PathVariable("payId") Integer id, @PathVariable("isPay") Byte isPay) {
        //标示
        Integer result;

        result = payService.updatePayTable(id, isPay);

        return Objects.equals(result, 0) ? "更新成功" : "更新失败";
    }
}
