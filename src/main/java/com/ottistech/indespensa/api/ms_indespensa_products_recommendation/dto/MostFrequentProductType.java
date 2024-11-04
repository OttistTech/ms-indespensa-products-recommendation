package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents the most frequently occurring product type along with its count.")
public record MostFrequentProductType(

        @Schema(description = "The product type that occurs most frequently.", example = "Dairy")
        String productType,

        @Schema(description = "Count of occurrences for this product type.", example = "4500")
        Integer count
) {
}
