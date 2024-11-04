package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.controller;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.controller.contract.AnalyticsContract;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto.*;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.service.AnalyticsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/analytics")
public class AnalyticsController implements AnalyticsContract {

    private final AnalyticsService analyticsService;

    @GetMapping("/total-products")
    public ResponseEntity<TotalProducts> getTotalNumberOfProducts() {

        TotalProducts totalProducts = analyticsService.getTotalNumberProductsCount();

        return ResponseEntity.ok(totalProducts);
    }

    @GetMapping("/most-common-product-category")
    public ResponseEntity<MostCommonCategory> getMostCommonCategory() {

        MostCommonCategory mostCommonCategory = analyticsService.getMostCommonCategory();

        return ResponseEntity.ok(mostCommonCategory);
    }


    @GetMapping("/total-amount-of-all-products-by-type")
    public ResponseEntity<List<TotalAmountByType>> getTotalAmountOfAllProductsByType() {

        List<TotalAmountByType> totalAmountByType = analyticsService.getTotalAmountProductByType();

        return ResponseEntity.ok(totalAmountByType);
    }

    @GetMapping("/top5")
    public ResponseEntity<List<TopBrand>> getTop5Brands() {
        List<TopBrand> topBrands = analyticsService.getTopFiveBrands();

        return ResponseEntity.ok(topBrands);
    }

    @GetMapping("/average-amount")
    public ResponseEntity<List<AverageAmountByCategory>> getAverageAmountByCategory() {
        List<AverageAmountByCategory> averageAmountByCategories = analyticsService.getAverageAmountByCategory();

        return ResponseEntity.ok(averageAmountByCategories);
    }

    @GetMapping("/most-frequent-type")
    public ResponseEntity<MostFrequentProductType> getMostFrequentProductType() {
        MostFrequentProductType mostFrequentProductType = analyticsService.getMostFrequentProductType();

        return ResponseEntity.ok(mostFrequentProductType);
    }
}
