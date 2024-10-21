package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.service;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model.Product;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getRecommendedProducts(Long userId) {
        List<Product> products = productRepository.findAllByUserId(userId);

        if (products.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No products recommended for you");

        return products;
    }
}
