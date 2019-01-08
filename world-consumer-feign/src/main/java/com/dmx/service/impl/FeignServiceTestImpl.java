package com.dmx.service.impl;

import com.dmx.service.FeignServiceTest;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceTestImpl implements FeignServiceTest {
    @Override
    public String sayHello(String name) {
        return "feign inner hystrix." + name;
    }
}
