package com.dmx.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Value("${world-provide}")
    private String worldProvide;
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "apiError")
    public String api(String name){
        return restTemplate.getForObject(worldProvide + "/api?name="+name, String.class);
    }
    private String apiError(String name){
        return "sorry " + name + ".there is an error";
    }
}
