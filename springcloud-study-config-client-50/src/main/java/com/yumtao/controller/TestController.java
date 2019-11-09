package com.yumtao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangqintao
 * @date 2019-09-05
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${test.name}")
    private String val;

    @GetMapping(value = "/test")
    public String test() {
        return "testname: " + val;
    }

    @GetMapping(value = "/hb")
    public String hb() {
        return "1";
    }
}
