package org.example.ktspringmvn.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

@Configuration
@EnableReactiveMethodSecurity
class WebFluxSecurityConfig {

    @Bean
    fun securityWebFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain = http
            .csrf().disable() // Disable CSRF protection
            .authorizeExchange { spec ->
                // TODO: Change what URIs are allowed
                spec.pathMatchers(
                        "/**",
                ).permitAll()
            }
            .build()
}
