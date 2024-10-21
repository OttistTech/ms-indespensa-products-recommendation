package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.controller;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model.Recommendation;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.service.RecommendationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final RecommendationService recommendationService;

    @GetMapping("/reccomendation")
    public ResponseEntity<Recommendation> getProductReccomendation(
            @RequestParam Long userId
    ) {

        Recommendation recommendedProducts = recommendationService.getRecommendation(userId);

        return ResponseEntity.ok(recommendedProducts);
    }
}
