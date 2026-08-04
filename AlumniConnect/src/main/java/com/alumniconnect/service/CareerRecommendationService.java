package com.alumniconnect.service;

import java.util.List;

import com.alumniconnect.entity.CareerRecommendation;

public interface CareerRecommendationService {

    CareerRecommendation addRecommendation(CareerRecommendation recommendation);

    CareerRecommendation updateRecommendation(CareerRecommendation recommendation);

    void deleteRecommendation(int careerId);

    CareerRecommendation getRecommendationById(int careerId);

    List<CareerRecommendation> getAllRecommendations();

}