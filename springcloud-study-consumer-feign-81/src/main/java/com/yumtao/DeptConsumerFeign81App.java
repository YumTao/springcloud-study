package com.yumtao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient // eureka客户端
@EnableFeignClients // 开启feign使用
@SpringBootApplication
public class DeptConsumerFeign81App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign81App.class, args);
    }


}
