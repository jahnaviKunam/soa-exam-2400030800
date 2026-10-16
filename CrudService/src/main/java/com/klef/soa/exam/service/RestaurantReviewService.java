package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.RestaurantReview;

public interface RestaurantReviewService {

    RestaurantReview addReview(RestaurantReview review);

    List<RestaurantReview> displayAll();

    void deleteReview(Long id);
}