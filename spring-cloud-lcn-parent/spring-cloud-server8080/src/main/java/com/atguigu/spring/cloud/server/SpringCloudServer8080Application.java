package com.atguigu.spring.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudServer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServer8080Application.class, args);
    }

}
