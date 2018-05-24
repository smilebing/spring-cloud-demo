package com.zhuhe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhuhe on 2018/5/23.
 */
@Service
public class Helloservice {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://eureka-client-hi/hi?name="+name,String.class);
    }

}
