package com.yumtao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangqintao
 * @date 2019-09-05
 */
@RestController
public class TestController {

    @GetMapping(value = "/hb")
    public String hb() {
        return "1";
    }
}
