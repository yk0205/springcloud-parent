package com.yk.service;

import com.yk.entity.Dept;

import java.util.List;

/**
 * @Description TODO
 * @Author yk
 * @Date 2019/8/10 13:48
 */
public interface DeptService {

     Dept get(Long id);

     List<Dept> list();
}
