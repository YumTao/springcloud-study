package com.yumtao.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yangqintao
 * @date 2019-09-05
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   // eureka与ribbon结合，并使用默认负载均衡策略(轮询)
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 自己选择客户端负载均衡策略(必须要框架已实现的,且此配置是全局的)
     */
//    @Bean
//    IRule getRule() {
//        return new RandomRule();
//    }
}
