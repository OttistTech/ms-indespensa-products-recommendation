package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.controller;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model.Product;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.service.ProductService;
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
public class ProductController {

    private final ProductService productService;

    @GetMapping("/reccomendation")
    public ResponseEntity<List<Product>> getProductReccomendation(
            @RequestParam Long userId
    ) {

        List<Product> recommendedProducts = productService.getRecommendedProducts(userId);

        return ResponseEntity.ok(recommendedProducts);
    }
}
