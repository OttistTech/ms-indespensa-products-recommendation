package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.repository;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model.Recommendation;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RecommendationRepository extends MongoRepository<Recommendation, ObjectId> {

    Optional<Recommendation> findByUserId(Long user);

}
