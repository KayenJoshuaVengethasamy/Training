package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        http
//  disable spring csrf protection, this will allow us to post, get etc on postman.
//  Spring does this as a security mechanism so the data is not being interfered with
                .csrf().disable()
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
                        .requestMatchers("/notices", "/contact", "/register").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }

//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource) {
//        return new JdbcUserDetailsManager(dataSource);
//    }

    //    This does not encode the password and rather tells the system that it is a plain text password
//    not recommended for production
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService() {
/**
 * Approach 1 where we use withDefaultPasswordEncoder() method while creating the user details
 * This is deprecated and not recommended for production
 * <p>
 * Approach 2 where credentials of the users are stored inside the code
 * and inside the memory of the web application
 * Here we use NoOpPasswordEncoder Bean
 * This is deprecated and not recommended for production
 * <p>
 * Part of Approach 2
 * NoOpPasswordEEncoder is not recommended for production usage
 * use only for non-prod
 *
 * @return PasswordEncoder
 * <p>
 * Approach 2 where credentials of the users are stored inside the code
 * and inside the memory of the web application
 * Here we use NoOpPasswordEncoder Bean
 * This is deprecated and not recommended for production
 * <p>
 * Part of Approach 2
 * NoOpPasswordEEncoder is not recommended for production usage
 * use only for non-prod
 * @return PasswordEncoder
 */
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("12345")
//                .authorities("admin")
//                .build();
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("12345")
//                .authorities("read")
//                .build();
//        return new InMemoryUserDetailsManager(admin, user);
//    }
/**
 * Approach 2 where credentials of the users are stored inside the code
 * and inside the memory of the web application
 * Here we use NoOpPasswordEncoder Bean
 * This is deprecated and not recommended for production
 */
//        UserDetails admin = User.withUsername("admin")
//                .password("12345")
//                .authorities("admin")
//                .build();
//        UserDetails user = User.withUsername("user")
//                .password("12345")
//                .authorities("read")
//                .build();
//        return new InMemoryUserDetailsManager(admin, user);
//    }
//
/**
 * Part of Approach 2
 * NoOpPasswordEEncoder is not recommended for production usage
 * use only for non-prod
 *
 * @return PasswordEncoder
 */
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//}
//}