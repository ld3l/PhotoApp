package com.ld3l.photo.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoDiscoveryApplication.class, args);
    }

}
