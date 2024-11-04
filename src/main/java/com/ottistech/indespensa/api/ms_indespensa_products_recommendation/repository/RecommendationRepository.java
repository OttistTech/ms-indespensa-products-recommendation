package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.repository;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto.*;
import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model.Recommendation;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface RecommendationRepository extends MongoRepository<Recommendation, ObjectId> {

    Optional<Recommendation> findByUserId(Long user);

    @Aggregation(pipeline = {
            "{ $unwind: '$products' }",
            "{ $count: 'totalProducts' }"
    })
    Optional<TotalProducts> getTotalProductsCount();

    @Aggregation(pipeline = {
            "{ $unwind: '$products' }",
            "{ $group: { _id: '$products.category_name', count: { $sum: 1 } } }",
            "{ $sort: { count: -1 } }",
            "{ $limit: 1 }",
            "{ $project: { categoryName: '$_id', count: 1, _id: 0 } }"
    })
    Optional<MostCommonCategory> getMostCommonProductCategory();

    @Aggregation(pipeline = {
            "{ $unwind: '$products' }",
            "{ $group: { _id: '$products.type', totalAmount: { $sum: '$products.amount' } } }",
            "{ $project: { productType: '$_id', totalAmount: 1, _id: 0 } }"
    })
    List<TotalAmountByType> getTotalAmountByProductType();

    @Aggregation(pipeline = {
            "{ $unwind: '$products' }",
            "{ $group: { _id: '$products.brand_name', count: { $sum: 1 } } }",
            "{ $sort: { count: -1 } }",
            "{ $limit: 5 }",
            "{ $project: { brandName: '$_id', count: 1, _id: 0 } }"
    })
    List<TopBrand> getTopFiveBrands();

    @Aggregation(pipeline = {
            "{ $unwind: '$products' }",
            "{ $group: { _id: '$products.category_name', averageAmount: { $avg: '$products.amount' } } }",
            "{ $project: { categoryName: '$_id', averageAmount: 1, _id: 0 } }"
    })
    List<AverageAmountByCategory> getAverageAmountByCategory();

    @Aggregation(pipeline = {
            "{ $unwind: '$products' }",
            "{ $group: { _id: '$products.type', count: { $sum: 1 } } }",
            "{ $sort: { count: -1 } }",
            "{ $limit: 1 }",
            "{ $project: { productType: '$_id', count: 1, _id: 0 } }"
    })
    Optional<MostFrequentProductType> getMostFrequentProductType();
}
