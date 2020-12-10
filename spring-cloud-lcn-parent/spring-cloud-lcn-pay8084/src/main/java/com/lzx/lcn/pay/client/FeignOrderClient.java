package com.lzx.lcn.pay.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SpringCloudOrder8083")
public interface FeignOrderClient {

    @RequestMapping("/order/updateOrder")
    Integer updateOrder();

}
