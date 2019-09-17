package com.yumtao.hystrix;

import com.yumtao.api.DeptService;
import com.yumtao.entity.Dept;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangqintao
 * @date 2019-09-12
 */
@Slf4j
@Component
public class DeptServiceFallBackFactory implements FallbackFactory<DeptService> {

    @Override
    public DeptService create(Throwable throwable) {

        return new DeptService() {
            @Override
            public void addDept(Dept dept) {
                log.error("addDept:限流降级触发,请稍后重试");
            }

            @Override
            public Dept findById(Long deptNo) {
                log.error("findById:限流降级触发,请稍后重试");
                return Dept.builder().deptName("限流降级触发,请稍后重试").build();
            }

            @Override
            public List<Dept> findAll() {
                log.error("findAll:限流降级触发,请稍后重试");
                List<Dept> result = new ArrayList<>();
                result.add(Dept.builder().deptName("限流降级触发,请稍后重试").build());
                return result;
            }
        };
    }
}
