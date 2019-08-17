package com.yk;


import com.alibaba.fastjson.JSONObject;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Author yk
 * @Date 2019/8/15 21:06
 */
public class JsonAddTest {

    public static void main(String[] args) {
        List<JSONObject> jsonList = new ArrayList<JSONObject>();
        JSONObject json1 = new JSONObject();
        json1.put("c", 1);
        json1.put("b", 1);
        json1.put("e", 1);
        JSONObject json2 = new JSONObject();
        json2.put("f", 1);
        json2.put("a", 1);
        json2.put("d", 1);
        json2.put("c", 1);
        JSONObject json3 = new JSONObject();
        json3.put("a", 1);
        json3.put("c", 1);
        json3.put("e", 1);
        json3.put("f", 1);
        jsonList.add(json1);
        jsonList.add(json2);
        jsonList.add(json3);

        Map<String, Integer> typeMap = new HashMap<>();
        jsonList.forEach(a -> {
            Iterator<Map.Entry<String, Object>> it = a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry e = it.next();
                if (typeMap.containsKey(e.getKey())) {
                    Integer count = typeMap.get(e.getKey().toString());
                    typeMap.put(e.getKey().toString(), count + Integer.valueOf(e.getValue().toString()));
                } else {
                    typeMap.put(e.getKey().toString(), Integer.valueOf(e.getValue().toString()));
                }
            }
        });
        System.out.println(typeMap);


        List<Map.Entry<String, Integer>> collect = new ArrayList<>(typeMap.entrySet()).stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).collect(Collectors.toList());
        for (Map.Entry<String, Integer> entry : collect) {
            System.out.println(entry.getKey()+"------"+entry.getValue());
        }



    }
}
