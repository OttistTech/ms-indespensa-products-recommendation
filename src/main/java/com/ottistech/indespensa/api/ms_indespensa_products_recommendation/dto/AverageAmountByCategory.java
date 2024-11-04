package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto;

public record AverageAmountByCategory(
        String categoryName,
        Double averageAmount
) {
}
