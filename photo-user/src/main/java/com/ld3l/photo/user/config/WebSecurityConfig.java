package com.ld3l.photo.user.config;

import com.ld3l.photo.user.security.AuthenticationFilter;
import com.ld3l.photo.user.service.MyUserDetailsService;
import com.ld3l.photo.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private MyUserDetailsService userDetailsService;
    private UserService userService;
    private BCryptPasswordEncoder encoder;
    private Environment environment;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests().antMatchers("/login/**").permitAll()
                .anyRequest().permitAll()
                .and()
                .addFilter(getAuthFilter());
    }
    private AuthenticationFilter getAuthFilter() throws Exception {
        AuthenticationFilter filter = new AuthenticationFilter(userService, environment);
        filter.setAuthenticationManager(authenticationManager());
        return filter;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
    }


}
