package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents a brand along with its frequency in the product data.")
public record TopBrand(

        @Schema(description = "Name of the brand.", example = "Coca-Cola")
        String brandName,

        @Schema(description = "Count of products for this brand.", example = "800")
        Integer count
) {
}
