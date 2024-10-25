package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Schema(description = "Product entity representing details of a product.")
@Data
public class Product {

    @Schema(description = "Unique ID of the product", example = "1001")
    @Field("product_id")
    private Long productId;

    @Schema(description = "Barcode of the product", example = "1234567890123")
    @Field("ean_code")
    private String eanCode;

    @Schema(description = "Name of the product", example = "Chocolate Bar")
    private String name;

    @Schema(description = "URL to an image of the product", example = "https://example.com/product-image.jpg")
    @Field("image_url")
    private String imageUrl;

    @Schema(description = "Name of the associated food", example = "Sugar")
    @Field("food_name")
    private String foodName;

    @Schema(description = "Name of the associated category", example = "Sweet")
    @Field("category_name")
    private String categoryName;

    @Schema(description = "Detailed description of the product", example = "A delicious chocolate bar")
    private String description;

    @Schema(description = "Name of the associated brand", example = "Lindt")
    @Field("brand_name")
    private String brandName;

    @Schema(description = "Amount of the product", example = "500.00")
    private BigDecimal amount;

    @Schema(description = "Unit of measurement for the product amount", example = "g")
    private String unit;

    @Schema(description = "Type of the product", example = "Food")
    private String type;
}
