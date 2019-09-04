package com.yumtao.config;

import org.springframework.beans.factory.annotation.Autowired;
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
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
