package com.yumtao.service.impl;

import com.yumtao.dao.mapper.DeptMapper;
import com.yumtao.entity.Dept;
import com.yumtao.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public void addDept(Dept dept) {
        deptMapper.insert(dept);
    }

    @Override
    public Dept findById(Long deptNo) {
        Dept query = Dept.builder().deptNo(deptNo).build();
        return deptMapper.selectByPrimaryKey(query);
    }

    @Override
    public List<Dept> findAll() {
        return deptMapper.selectAll();
    }
}
