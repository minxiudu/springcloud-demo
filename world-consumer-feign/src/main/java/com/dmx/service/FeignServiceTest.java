package com.dmx.service;

import com.dmx.service.impl.FeignServiceTestImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "WORLD-PROVIDE", fallback = FeignServiceTestImpl.class)
public interface FeignServiceTest {
    @PostMapping("api")
    String sayHello(@RequestParam(value = "name") String name);
}
