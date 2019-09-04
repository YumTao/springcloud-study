package com.yumtao.controller;

import com.yumtao.entity.Dept;
import com.yumtao.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yangqintao
 * @date 2019-09-04
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping(value = "/dept/add")
    public void addDept(@RequestBody Dept dept) {
        deptService.addDept(dept);
    }

    @GetMapping(value = "/dept/findById/{deptNo}")
    public Dept findById(Long deptNo) {
        return deptService.findById(deptNo);
    }

    @RequestMapping(value = "/dept/findAll", method = RequestMethod.GET)
    public List<Dept> findAll() {
        return deptService.findAll();
    }

}
