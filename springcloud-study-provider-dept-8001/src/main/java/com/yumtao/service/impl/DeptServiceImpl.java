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

//    @HystrixCommand(fallbackMethod = "defaultDept")
    @Override
    public Dept findById(Long deptNo) {
        Dept result = deptMapper.selectByPrimaryKey(deptNo);
        if (null == result) {
            throw new RuntimeException("部门不存在");
        }

        return result;
    }

//    public Dept defaultDept(Long deptNo) {
//        return Dept.builder().deptName("服务不可用").build();
//    }

    @Override
    public List<Dept> findAll() {
        return deptMapper.selectAll();
    }
}
