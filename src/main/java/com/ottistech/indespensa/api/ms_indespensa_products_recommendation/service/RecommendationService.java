package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.service;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto.*;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model.Recommendation;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.repository.RecommendationRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class RecommendationService {

    private final RecommendationRepository recommendationRepository;

    public Recommendation getRecommendation(Long userId) {

        return recommendationRepository.findByUserId(userId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No recommendations found for user."));
    }

    public TotalProducts getTotalNumberProductsCount() {

       return recommendationRepository.getTotalProductsCount()
               .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No products found in the collection."));
    }

    public MostCommonCategory getMostCommonCategory() {

        return recommendationRepository.getMostCommonProductCategory()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No categories found in the collection."));
    }

    public List<TotalAmountByType> getTotalAmountProductByType() {

        List<TotalAmountByType> totalAmountByTypes = recommendationRepository.getTotalAmountByProductType();

        if (totalAmountByTypes.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No total amount product by type found");

        return totalAmountByTypes;
    }

    public List<TopBrand> getTopFiveBrands() {
        List<TopBrand> topBrands = recommendationRepository.getTopFiveBrands();

        if (topBrands.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No brands found");

        return topBrands;
    }

    public List<AverageAmountByCategory> getAverageAmountByCategory() {
        List<AverageAmountByCategory> averageAmountByCategories = recommendationRepository.getAverageAmountByCategory();

        if (averageAmountByCategories.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No categories found");

        return averageAmountByCategories;
    }

    public MostFrequentProductType getMostFrequentProductType() {

        return recommendationRepository.getMostFrequentProductType()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No products types found in the collection."));
    }
}
