package com.dmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WorldConfigLocalServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorldConfigLocalServerApplication.class, args);
    }
}
