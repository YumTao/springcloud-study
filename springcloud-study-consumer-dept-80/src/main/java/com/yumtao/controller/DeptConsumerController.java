package com.yumtao.controller;

import com.yumtao.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author yangqintao
 * @date 2019-09-05
 */
@RestController
public class DeptConsumerController {

    private String DEPT_SERVICE_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/dept/add")
    public void addDept(Dept deptEntity) {
        restTemplate.postForObject(DEPT_SERVICE_URL + "/dept/add", deptEntity, void.class);
    }

    @GetMapping(value = "/consumer/dept/findById/{deptNo}")
    public Dept findById(@PathVariable("deptNo") Long deptNo) {
        return restTemplate.getForObject(DEPT_SERVICE_URL + "/dept/findById/" + deptNo, Dept.class);
    }

    @GetMapping(value = "/consumer/dept/findAll")
    public List<Dept> findAll() {
        return restTemplate.getForObject(DEPT_SERVICE_URL + "/dept/findAll", List.class);
    }
}
