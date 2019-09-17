package com.yumtao.controller;

import com.yumtao.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author yangqintao
 * @date 2019-09-05
 */
@RestController
@RequestMapping("eureka")
public class DeptEurekaConsumerController {

    // eureka中注册服务的application名
    private String EUREKA_SERVICE_NAME = "http://STUDY-SPRINGCLOUD-DEPT";

    // spring-cloud提供的rest工具类
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/dept/add")
    public void addDept(Dept deptEntity) {
        restTemplate.postForObject(EUREKA_SERVICE_NAME + "/dept/add", deptEntity, void.class);
    }

    @GetMapping(value = "/consumer/dept/findById/{deptNo}")
    public Dept findById(@PathVariable("deptNo") Long deptNo) {
        return restTemplate.getForObject(EUREKA_SERVICE_NAME + "/dept/findById/" + deptNo, Dept.class);
    }

    @GetMapping(value = "/consumer/dept/findAll")
    public List<Dept> findAll() {
        return restTemplate.getForObject(EUREKA_SERVICE_NAME + "/dept/findAll", List.class);
    }
}
