package com.ottistech.indespensa.api.ms_indespensa_tracking.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIConfig {

    @Bean
    public Dotenv dotenv() {
        Dotenv dotenv = Dotenv.configure().load();
        String securityUsername = dotenv.get("SECURITY_USERNAME");
        String securityPassword = dotenv.get("SECURITY_PASSWORD");

        System.setProperty("SECURITY_USERNAME", securityUsername);
        System.setProperty("SECURITY_PASSWORD", securityPassword);

        return dotenv;
    }
}
