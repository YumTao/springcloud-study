package com.yumtao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangqintao
 * @date 2019-09-04
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dept {

    private Long deptNo;

    private String deptName;

    private String dbSource;
}
