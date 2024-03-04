package com.malek.app.rest.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.transaction.TransactionDefinition.withDefaults;

@Configuration
public class SecurityConfiguration {

    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
               .csrf().disable()
               .authorizeRequests()
               .anyRequest().authenticated()
               .and()
               .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        return http.build();
    }

}
