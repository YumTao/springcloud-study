package com.yumtao.api;

import com.yumtao.entity.Dept;
import com.yumtao.hystrix.DeptServiceFallBackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * feign 调用eureka 的STUDY-SPRINGCLOUD-DEPT服务
 *
 * @author yangqintao
 * @date 2019-09-04
 */
@FeignClient(name = "STUDY-SPRINGCLOUD-DEPT", fallbackFactory = DeptServiceFallBackFactory.class)
public interface DeptService {

    @PostMapping(value = "/dept/add")
    void addDept(Dept dept);

    @GetMapping(value = "/dept/findById/{deptNo}")
    Dept findById(@PathVariable("deptNo") Long deptNo);

    @RequestMapping(value = "/dept/findAll", method = RequestMethod.GET)
    List<Dept> findAll();
}
