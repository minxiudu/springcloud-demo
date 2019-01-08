package com.dmx.controller;

import com.dmx.service.FeignServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class FeignTestController {
    @Autowired
    private FeignServiceTest feignServiceTest;
    @GetMapping("api")
    public String feignTest(String name){
        return feignServiceTest.sayHello(name);
    }
}
