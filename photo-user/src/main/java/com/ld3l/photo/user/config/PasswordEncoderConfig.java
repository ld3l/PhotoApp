package com.ld3l.photo.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
public class PasswordEncoderConfig {
    @Bean
    BCryptPasswordEncoder cryptPasswordEncoder(){
        return new BCryptPasswordEncoder(10);
    }
}
