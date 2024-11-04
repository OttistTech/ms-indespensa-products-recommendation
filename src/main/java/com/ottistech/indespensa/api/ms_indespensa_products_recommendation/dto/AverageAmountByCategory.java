package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents the average amount of products grouped by category.")

public record AverageAmountByCategory(

        @Schema(description = "Name of the category.", example = "Beverages")

        String categoryName,

        @Schema(description = "Average amount of products in this category.", example = "15.5")
        Double averageAmount
) {
}
