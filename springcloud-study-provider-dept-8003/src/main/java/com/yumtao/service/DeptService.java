package com.yumtao.service;

import com.yumtao.entity.Dept;

import java.util.List;

/**
 * @author yangqintao
 * @date 2019-09-04
 */
public interface DeptService {

    void addDept(Dept dept);

    Dept findById(Long deptNo);

    List<Dept> findAll();
}
