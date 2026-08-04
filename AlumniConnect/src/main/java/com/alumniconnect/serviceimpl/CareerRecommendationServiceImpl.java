package com.alumniconnect.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumniconnect.entity.CareerRecommendation;
import com.alumniconnect.repository.CareerRecommendationRepository;
import com.alumniconnect.service.CareerRecommendationService;

@Service
public class CareerRecommendationServiceImpl implements CareerRecommendationService {

    @Autowired
    private CareerRecommendationRepository careerRecommendationRepository;


    @Override
    public CareerRecommendation addRecommendation(CareerRecommendation recommendation) {
        return careerRecommendationRepository.save(recommendation);
    }


    @Override
    public CareerRecommendation updateRecommendation(CareerRecommendation recommendation) {
        return careerRecommendationRepository.save(recommendation);
    }


    @Override
    public void deleteRecommendation(int careerId) {
        careerRecommendationRepository.deleteById(careerId);
    }


    @Override
    public CareerRecommendation getRecommendationById(int careerId) {
        return careerRecommendationRepository.findById(careerId).orElse(null);
    }


    @Override
    public List<CareerRecommendation> getAllRecommendations() {
        return careerRecommendationRepository.findAll();
    }
}