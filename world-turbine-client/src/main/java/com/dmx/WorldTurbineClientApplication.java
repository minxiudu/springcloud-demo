package com.dmx;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringCloudApplication
@EnableHystrix
@EnableTurbine
public class WorldTurbineClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorldTurbineClientApplication.class, args);
    }
}
