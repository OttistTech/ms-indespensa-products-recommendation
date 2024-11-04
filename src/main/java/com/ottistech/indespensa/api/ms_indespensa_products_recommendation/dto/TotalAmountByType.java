package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto;

public record TotalAmountByType(
        String productType,
        Integer totalAmount
) {
}
