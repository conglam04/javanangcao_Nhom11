package com.example.travel_suggestion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .csrf(csrf -> csrf.disable()) // Tắt CSRF
	            .authorizeHttpRequests(auth -> auth
	                .anyRequest().permitAll() // Cho phép truy cập tất cả các URL
	            )
	            .formLogin(form -> form.disable()) // Tắt form login
	            .httpBasic(httpBasic -> httpBasic.disable()); // Tắt xác thực Basic

	        return http.build();
	    }

	}
