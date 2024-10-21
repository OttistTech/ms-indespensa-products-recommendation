package com.ottistech.indespensa.api.ms_indespensa_products_recommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.ottistech.indespensa.api.ms_indespensa_products_recommendation.repository")
public class MsIndespensaProductsRecommendationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsIndespensaProductsRecommendationApplication.class, args);
    }

}
