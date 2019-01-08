package com.dmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WorldProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorldProvideApplication.class, args);
    }
}
