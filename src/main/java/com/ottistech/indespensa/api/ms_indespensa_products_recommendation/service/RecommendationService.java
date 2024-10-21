package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.service;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model.Recommendation;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.repository.RecommendationRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
public class RecommendationService {

    private final RecommendationRepository recommendationRepository;

    public Recommendation getRecommendation(Long userId) {

        return recommendationRepository.findByUserId(userId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No recommendations found for user."));
    }
}
