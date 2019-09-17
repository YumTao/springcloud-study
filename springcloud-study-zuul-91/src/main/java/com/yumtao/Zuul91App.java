package com.yumtao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Zuul91App {

    public static void main(String[] args) {
        SpringApplication.run(Zuul91App.class, args);
    }


}
