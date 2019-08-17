package com.yk;


import com.alibaba.fastjson.JSONObject;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Author yk
 * @Date 2019/8/15 21:06
 */
public class JsonAddTwoTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String a = "a,b,c,d,e";
        String a1 = "a,b,c,d,e";
        String a2 = "a,b,c,d,e";
        String a3 = "a,b,c,d,e";
        list.addAll(Arrays.asList(a.split(",")));
        list.addAll(Arrays.asList(a1.split(",")));
        list.addAll(Arrays.asList(a2.split(",")));
        list.addAll(Arrays.asList(a3.split(",")));




    }
}
