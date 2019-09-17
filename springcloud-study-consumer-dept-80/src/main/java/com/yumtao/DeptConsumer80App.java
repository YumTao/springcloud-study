package com.yumtao;

import myconfig.MyRibbonConfig;
import myconfig.MyRoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@EnableEurekaClient // eureka客户端
// 自定义ribbon配置
//@RibbonClient(name = "STUDY-SPRINGCLOUD-DEPT", configuration = MyRibbonConfig.class)
//@RibbonClients(value = {@RibbonClient(name = "STUDY-SPRINGCLOUD-DEPT", configuration = MyRibbonConfig.class)})
@SpringBootApplication
public class DeptConsumer80App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80App.class, args);
    }


}
