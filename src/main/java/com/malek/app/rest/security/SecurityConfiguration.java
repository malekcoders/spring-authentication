package com.malek.app.rest.security;

import org.springframework.context.annotation.Configuration;

import static org.springframework.transaction.TransactionDefinition.withDefaults;

@Configuration
public class SecurityConfiguration {

    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authz) -> authz
                        .anyRequest().authenticated()
                )
                .httpBasic(withDefaults());
        return http.build();
    }

}
