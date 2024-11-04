package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.service;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto.*;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.repository.AnalyticsRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Service
public class AnalyticsService {

    private final AnalyticsRepository analyticsRepository;

    public TotalProducts getTotalNumberProductsCount() {

        return analyticsRepository.getTotalProductsCount()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No products found in the collection."));
    }

    public MostCommonCategory getMostCommonCategory() {

        return analyticsRepository.getMostCommonProductCategory()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No categories found in the collection."));
    }

    public List<TotalAmountByType> getTotalAmountProductByType() {

        List<TotalAmountByType> totalAmountByTypes = analyticsRepository.getTotalAmountByProductType();

        if (totalAmountByTypes.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No total amount product by type found");

        return totalAmountByTypes;
    }

    public List<TopBrand> getTopFiveBrands() {
        List<TopBrand> topBrands = analyticsRepository.getTopFiveBrands();

        if (topBrands.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No brands found");

        return topBrands;
    }

    public List<AverageAmountByCategory> getAverageAmountByCategory() {
        List<AverageAmountByCategory> averageAmountByCategories = analyticsRepository.getAverageAmountByCategory();

        if (averageAmountByCategories.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No categories found");

        return averageAmountByCategories;
    }

    public MostFrequentProductType getMostFrequentProductType() {

        return analyticsRepository.getMostFrequentProductType()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No products types found in the collection."));
    }
}
