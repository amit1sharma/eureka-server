package com.boot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceDiscoveryServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceDiscoveryServer.class, args);
    }

}
