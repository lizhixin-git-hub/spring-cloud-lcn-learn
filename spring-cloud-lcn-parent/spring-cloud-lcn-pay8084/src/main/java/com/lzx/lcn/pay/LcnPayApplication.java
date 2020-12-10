package com.lzx.lcn.pay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.lzx.lcn.pay.mapper")
public class LcnPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcnPayApplication.class, args);
    }

}
