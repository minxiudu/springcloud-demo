package com.dmx;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringCloudApplication
@EnableHystrix
@EnableHystrixDashboard
public class WorldHystrixDashboard {
    public static void main(String[] args) {
        SpringApplication.run(WorldHystrixDashboard.class, args);
    }
}
