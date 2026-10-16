package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.RestaurantReview;
import com.klef.soa.exam.service.RestaurantReviewService;

@RestController
public class RestaurantReviewController {

    @Autowired
    private RestaurantReviewService service;

    @GetMapping("/")
    public String home() {
        return "RestaurantReview Service is running";
    }

    @PostMapping("/Add")
    public RestaurantReview addReview(
            @RequestBody RestaurantReview review) {
        return service.addReview(review);
    }

    @GetMapping("/DisplayAll")
    public List<RestaurantReview> displayAll() {
        return service.displayAll();
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteReview(@PathVariable Long id) {
        service.deleteReview(id);
        return "Review deleted successfully";
    }
}