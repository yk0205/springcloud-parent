package com.yk.controller;


import com.yk.entity.Dept;
import com.yk.service.DeptService;
import com.alibaba.fastjson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author yk
 * @Date 2019/8/10 13:50
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient client;


    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }

    @ResponseBody
    @RequestMapping(value = "/getJson")
    public Map getJSON() {
        Map map = new HashMap<>();
        JSONObject properties = new JSONObject();
        properties.put("id","1");
        properties.put("name","yangkai");
        StringBuffer sb = new StringBuffer();
        sb.append("/deepAnalyze?queryJson=");

        sb.append(properties);
        map.put("url",sb.toString().replace("\\","") );
        map.put("url2",properties );
        return map;
    }

    /**
     * 服务的发现
     * @return
     */
    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("springcloud-dept");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }



}