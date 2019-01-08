package com.dmx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${server.port}")
    private Integer port;
    @RequestMapping("api")
    public String api(String name){
        return "hi " + name + ",i am from port : " + port;
    }
}
