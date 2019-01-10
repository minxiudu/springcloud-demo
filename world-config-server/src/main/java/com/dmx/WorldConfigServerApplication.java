package com.dmx;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringCloudApplication
@EnableConfigServer
public class WorldConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorldConfigServerApplication.class, args);
    }
}
