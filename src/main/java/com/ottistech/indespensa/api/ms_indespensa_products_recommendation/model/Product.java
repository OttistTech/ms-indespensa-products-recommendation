package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
public class Product {

    @Field("product_id")
    private Long productId;

    @Field("ean_code")
    private String eanCode;

    private String name;

    @Field("image_url")
    private String imageUrl;

    @Field("food_id")
    private Integer foodId;

    @Field("category_id")
    private Integer categoryId;

    private String description;

    @Field("brand_id")
    private Integer brandId;

    private BigDecimal amount;

    private String unit;

    private String type;
}
