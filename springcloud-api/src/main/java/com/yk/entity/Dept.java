package com.yk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author yk
 * @Date 2019/8/10 12:23
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)  // Accessor的中文含义是存取器，@Accessors用于配置getter和setter方法的生成结果，
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;




}
