package com.protonpreschool.schoolmanagement.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.protonpreschool.schoolmanagement.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .requestMatchers("/admin/**").hasRole("ADMIN")  // Only ADMIN can access /admin
                .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")  // USER and ADMIN can access /user
                .anyRequest().authenticated()  // Any other request needs authentication
            .and()
            .formLogin().permitAll()  // Enable form login
            .and()
            .httpBasic();  // Enable basic authentication

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        // Custom UserDetailsService implementation
        return new CustomUserDetailsService();
    }
}
