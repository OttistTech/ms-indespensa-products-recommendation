package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents the total number of products across all users.")
public record TotalProducts(

        @Schema(description = "Total count of all products.", example = "532")
        Integer totalProducts
) {
}
