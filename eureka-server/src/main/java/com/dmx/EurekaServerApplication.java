package com.dmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/*# 映射{application}-{profile}.properties文件
/{application}/{profile}/[{label}]
/{label}/{application}-{profile}.yml
/{application}-{profile}.yml*/
// label:分支 application：项目名称 profile：环境
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
