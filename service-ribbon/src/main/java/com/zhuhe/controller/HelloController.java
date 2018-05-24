package com.zhuhe.controller;

import com.zhuhe.service.Helloservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuhe on 2018/5/23.
 */
@RestController
public class HelloController {

    @Autowired
    Helloservice helloservice;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return helloservice.hiService(name);
    }
}
