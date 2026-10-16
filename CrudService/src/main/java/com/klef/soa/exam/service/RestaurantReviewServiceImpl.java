package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.RestaurantReview;
import com.klef.soa.exam.repository.RestaurantReviewRepository;

@Service
public class RestaurantReviewServiceImpl
        implements RestaurantReviewService {

    @Autowired
    private RestaurantReviewRepository repository;

    @Override
    public RestaurantReview addReview(RestaurantReview review) {
        return repository.save(review);
    }

    @Override
    public List<RestaurantReview> displayAll() {
        return repository.findAll();
    }

    @Override
    public void deleteReview(Long id) {
        repository.deleteById(id);
    }
}