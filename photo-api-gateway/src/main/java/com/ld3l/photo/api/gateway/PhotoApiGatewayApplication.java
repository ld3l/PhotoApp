package com.ld3l.photo.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class PhotoApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoApiGatewayApplication.class, args);
    }

}
