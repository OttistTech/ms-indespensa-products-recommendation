package com.ottistech.indespensa.api.ms_indespensa_tracking.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIConfig {

    @Bean
    public Dotenv dotenv() {
        Dotenv env = Dotenv.configure().load();
        String securityUsername = env.get("SECURITY_USERNAME");
        String securityPassword = env.get("SECURITY_PASSWORD");

        System.setProperty("SECURITY_USERNAME", securityUsername);
        System.setProperty("SECURITY_PASSWORD", securityPassword);

        return env;
    }
}
