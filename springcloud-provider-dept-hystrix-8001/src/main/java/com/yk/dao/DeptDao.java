package com.yk.dao;

import com.yk.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description TODO
 * @Author yk
 * @Date 2019/8/10 13:50
 */
@Mapper
public interface DeptDao {

     Dept findById(Long id);

     List<Dept> findAll();
}
