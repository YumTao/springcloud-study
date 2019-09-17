package com.yumtao.dao.mapper.base;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description: 公用Mapper接口
 * @Date: 2018/9/22 17:44
 * @Author: xyz
 */
public interface IBaseMapper<T>  extends Mapper<T>, MySqlMapper<T> {
}
