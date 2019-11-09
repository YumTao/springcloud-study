package com.yumtao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * curl -X POST http://localhost:6001/bus/refresh
 * 使用以上命令动态刷新配置
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer6001App {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer6001App.class, args);
    }


}
