package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.controller.contract;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.model.Recommendation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Product", description = "Endpoints related to Products Recommendation management")
public interface ProductContract {

    @Operation(summary = "Get products recommendations for a user", description = "Fetches product recommendations based on the user ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully fetched recommendations",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Recommendation.class))),

            @ApiResponse(responseCode = "400", description = "Invalid user ID provided",
                    content = @Content(mediaType = "application/json")),

            @ApiResponse(responseCode = "404", description = "No recommendations found for user",
                    content = @Content(mediaType = "application/json")),
    })
    ResponseEntity<Recommendation> getProductReccomendation(
            @Parameter(in = ParameterIn.QUERY, description = "ID of the user to get products recommendation.", example = "1234", required = true)
            Long userId
    );
}
