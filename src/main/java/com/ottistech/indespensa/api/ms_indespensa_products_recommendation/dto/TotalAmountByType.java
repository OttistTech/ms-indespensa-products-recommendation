package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents the total amount of all products grouped by product type.")
public record TotalAmountByType(

        @Schema(description = "Type of product.", example = "Cereal")
        String productType,

        @Schema(description = "Total amount of products for this type.", example = "1400")
        Integer totalAmount
) {
}
