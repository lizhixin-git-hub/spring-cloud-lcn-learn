package com.lzx.lcn.order.controller;

import com.lzx.lcn.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    private IOrderService orderService;

    @Autowired
    public void setOrderService(IOrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("/updateOrder")
    public Integer updateOrder() {
        return orderService.updateOrder();
    }

}
