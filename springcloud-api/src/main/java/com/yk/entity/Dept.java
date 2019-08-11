package com.yk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author yk
 * @Date 2019/8/10 12:23
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;




}
