package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents the most common product category along with its count.")
public record MostCommonCategory(

        @Schema(description = "Name of the most common product category.", example = "Snacks")
        String categoryName,

        @Schema(description = "Count of products in this category.", example = "3200")
        Integer count
) {
}
