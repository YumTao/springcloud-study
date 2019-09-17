package com.yumtao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // eureka服务端注解
@SpringBootApplication
public class EurekaServer7001App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001App.class, args);
    }


}
