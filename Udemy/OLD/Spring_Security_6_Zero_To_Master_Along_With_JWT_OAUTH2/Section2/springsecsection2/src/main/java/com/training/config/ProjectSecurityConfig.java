package com.training.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {
//  recommended for production as it is securing the URLs
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/myAccount","/myBalance","/myLoans","/myCards").authenticated()
                .requestMatchers("/notices","/contact").permitAll()
                .and().formLogin().and().httpBasic();
        return http.build();
    }

//    This is to deny all requests and not recommended for production purposes as anyone will be able to use the application without security
//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests()
//                .anyRequest().permitAll()
//                .and().formLogin()
//                .and().httpBasic();
//        return http.build();
//    }

//    This is to deny all requests and not recommended for production purposes as no one will be able to use the application
//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests()
//                .anyRequest().denyAll()
//                .and().formLogin()
//                .and().httpBasic();
//        return http.build();
//    }
}
