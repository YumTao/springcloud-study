package com.yumtao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangqintao
 * @date 2019-09-04
 */
@RestController
public class HbController {

    @GetMapping(value = "/hb")
    public String addDept() {
        return "online";
    }

}
