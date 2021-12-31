package com.ld3l.photo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoUsersApplication.class, args);
    }

}
