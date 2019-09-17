package com.yumtao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DeptProvider8003App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003App.class, args);
    }


}
