package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.controller;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.controller.contract.ProductContract;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto.*;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model.Recommendation;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.service.RecommendationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController implements ProductContract {

    private final RecommendationService recommendationService;

    @GetMapping("/recommendation")
    public ResponseEntity<Recommendation> getProductReccomendation(
            @RequestParam
            Long userId
    ) {

        Recommendation recommendedProducts = recommendationService.getRecommendation(userId);

        return ResponseEntity.ok(recommendedProducts);
    }

    @GetMapping("/total-products")
    public ResponseEntity<TotalProducts> getTotalNumberOfProducts() {

        TotalProducts totalProducts = recommendationService.getTotalNumberProductsCount();

        return ResponseEntity.ok(totalProducts);
    }

    @GetMapping("/most-common-product-category")
    public ResponseEntity<MostCommonCategory> getMostCommonCategory() {

        MostCommonCategory mostCommonCategory = recommendationService.getMostCommonCategory();

        return ResponseEntity.ok(mostCommonCategory);
    }
    

    @GetMapping("/total-amount-of-all-products-by-type")
    public ResponseEntity<List<TotalAmountByType>> getTotalAmountOfAllProductsByType() {

        List<TotalAmountByType> totalAmountByType = recommendationService.getTotalAmountProductByType();

        return ResponseEntity.ok(totalAmountByType);
    }

    @GetMapping("/top5")
    public ResponseEntity<List<TopBrand>> getTop5Brands() {
        List<TopBrand> topBrands = recommendationService.getTopFiveBrands();

        return ResponseEntity.ok(topBrands);
    }

    @GetMapping("/average-amount")
    public ResponseEntity<List<AverageAmountByCategory>> getAverageAmountByCategory() {
        List<AverageAmountByCategory> averageAmountByCategories = recommendationService.getAverageAmountByCategory();

        return ResponseEntity.ok(averageAmountByCategories);
    }

    @GetMapping("/most-frequent-type")
    public ResponseEntity<MostFrequentProductType> getMostFrequentProductType() {
        MostFrequentProductType mostFrequentProductType = recommendationService.getMostFrequentProductType();

        return ResponseEntity.ok(mostFrequentProductType);
    }
}
