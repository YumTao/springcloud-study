package com.yumtao.controller;

import com.yumtao.api.DeptService;
import com.yumtao.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yangqintao
 * @date 2019-09-05
 */
@RestController
@RequestMapping("feign")
public class DeptFeignController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/consumer/dept/add")
    public void addDept(Dept deptEntity) {
        deptService.addDept(deptEntity);
    }

    @GetMapping(value = "/consumer/dept/findById/{deptNo}")
    public Dept findById(@PathVariable("deptNo") Long deptNo) {
        return deptService.findById(deptNo);
    }

    @GetMapping(value = "/consumer/dept/findAll")
    public List<Dept> findAll() {
        return deptService.findAll();
    }
}
