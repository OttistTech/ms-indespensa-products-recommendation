package com.ottistech.indespensa.api.ms_indespensa_products_recommendation.controller.contract;

import com.ottistech.indespensa.api.ms_indespensa_products_recommendation.dto.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Tag(name = "Analytics", description = "Endpoints related to Analytics management")
public interface AnalyticsContract {

    @Operation(summary = "Get Total Number of Products", description = "Fetches the total number of products across all users.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Total products count retrieved successfully",
                    content = @Content(schema = @Schema(implementation = TotalProducts.class), mediaType = "application/json")),

            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(schema = @Schema()))
    })
    ResponseEntity<TotalProducts> getTotalNumberOfProducts();

    @Operation(summary = "Get Most Common Product Category", description = "Fetches the most common product category across all users.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Most common product category retrieved successfully",
                    content = @Content(schema = @Schema(implementation = MostCommonCategory.class), mediaType = "application/json")),

            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(schema = @Schema()))
    })
    ResponseEntity<MostCommonCategory> getMostCommonCategory();

    @Operation(summary = "Get Total Amount of All Products by Type", description = "Calculates the total amount of all products grouped by their type.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Total amount by product type retrieved successfully",
                    content = @Content(schema = @Schema(implementation = TotalAmountByType.class), mediaType = "application/json")),

            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(schema = @Schema()))
    })
    ResponseEntity<List<TotalAmountByType>> getTotalAmountOfAllProductsByType();

    @Operation(summary = "Get Top 5 Brands", description = "Retrieves the top 5 brands by popularity or frequency across all users.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Top 5 brands retrieved successfully",
                    content = @Content(schema = @Schema(implementation = TopBrand.class), mediaType = "application/json")),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(schema = @Schema()))
    })
    ResponseEntity<List<TopBrand>> getTop5Brands();

    @Operation(summary = "Get Average Amount by Category", description = "Calculates the average amount of products grouped by category across all users.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Average amount by category retrieved successfully",
                    content = @Content(schema = @Schema(implementation = AverageAmountByCategory.class), mediaType = "application/json")),

            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(schema = @Schema()))
    })
    ResponseEntity<List<AverageAmountByCategory>> getAverageAmountByCategory();

    @Operation(summary = "Get Most Frequent Product Type", description = "Fetches the most frequently occurring product type across all users.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Most frequent product type retrieved successfully",
                    content = @Content(schema = @Schema(implementation = MostFrequentProductType.class), mediaType = "application/json")),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(schema = @Schema()))
    })
    ResponseEntity<MostFrequentProductType> getMostFrequentProductType();
}
