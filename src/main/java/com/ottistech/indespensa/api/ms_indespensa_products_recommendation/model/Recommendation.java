package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Schema(description = "Recommendation entity representing daily product consumption recommendations for a user.")
@Document(collection = "daily_consumption")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Recommendation {

    @Schema(description = "The ID of the user who the recommendation is for", example = "123")
    @Field("user")
    private Long userId;

    @Schema(description = "A list of recommended products")
    private List<Product> products;

}
