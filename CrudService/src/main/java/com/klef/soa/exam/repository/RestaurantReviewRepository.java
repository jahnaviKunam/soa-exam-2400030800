package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.soa.exam.entity.RestaurantReview;

public interface RestaurantReviewRepository
        extends JpaRepository<RestaurantReview, Long> {
}