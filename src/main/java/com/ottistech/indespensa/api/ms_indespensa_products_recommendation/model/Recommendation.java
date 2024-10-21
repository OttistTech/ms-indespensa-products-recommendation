package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "daily_consumption")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Recommendation {

    @Field("user")
    private Long userId;

    private List<Product> products;

}
