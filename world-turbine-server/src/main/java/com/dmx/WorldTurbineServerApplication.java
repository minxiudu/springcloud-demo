package com.dmx;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringCloudApplication
@EnableTurbineStream
public class WorldTurbineServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorldTurbineServerApplication.class, args);
    }
}
