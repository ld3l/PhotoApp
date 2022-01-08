package com.ld3l.photoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PhotoConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoConfigApplication.class, args);
    }

}
