package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        /**
         * Below is the custom security configurations
         * The first block permits and authorises certain paths
         * The second denies all paths -- not recommended for production
         * The third permits all paths -- not recommended for production
         * The three code blocks below them are the exact same, however these have been deprecated.
         * Please see section 2 notes.
         */

//        All these are with Lambda DSL, the new supported style for Springboot
        http.authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
                        .requestMatchers("/notices", "/contact").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();

//        http.authorizeHttpRequests((requests) -> requests.anyRequest().denyAll())
//                .formLogin(Customizer.withDefaults())
//                .httpBasic(Customizer.withDefaults());
//        return http.build();

//        http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll())
//                .formLogin(Customizer.withDefaults())
//                .httpBasic(Customizer.withDefaults());
//        return http.build();

//        All these are without Lambda DSL, which is no longer supported
//        http.authorizeHttpRequests()
//                .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
//                .requestMatchers("/notices", "/contacts").permitAll()
//                .and().formLogin()
//                .and().httpBasic();
//        return http.build();
//    }

//        http.authorizeHttpRequests()
//                .anyRequest().denyAll()
//                .and().formLogin()
//                .and().httpBasic();
//        return http.build();
//    }

//        http.authorizeHttpRequests()
//                .anyRequest().permitAll()
//                .and().formLogin()
//                .and().httpBasic();
//        return http.build();
    }
}
