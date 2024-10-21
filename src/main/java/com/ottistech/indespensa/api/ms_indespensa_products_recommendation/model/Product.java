package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "daily_consumption")
public class Product {

    @JsonProperty(value = "user_id")
    Long userId;

    @JsonProperty(value = "product_id")
    Long productId;

    String name;

    @JsonProperty(value = "image_url")
    String imageUrl;

    Integer food;

    Integer category;

    String description;

    Integer brand;

    BigDecimal amount;

    String unity;

    String type;
}
