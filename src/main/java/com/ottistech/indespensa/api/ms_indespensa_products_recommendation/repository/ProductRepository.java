package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.repository;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, Long> {
    List<Product> findAllByUserId(Long userId);
}
