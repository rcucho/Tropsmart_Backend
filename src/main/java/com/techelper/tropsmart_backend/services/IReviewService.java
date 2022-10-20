package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.Review;
import com.techelper.tropsmart_backend.resources.comunications.ReviewResponse;
import com.techelper.tropsmart_backend.resources.inputs.ReviewInput;

public interface IReviewService extends ICrudService<Review> {
    ReviewResponse findAllReviews();
    ReviewResponse findReviewsByCustomerId(int customerId);
    ReviewResponse findReviewsByDriverId(int driverId);
    ReviewResponse findReviewById(int reviewId);
    ReviewResponse addReviewByCargoId(int cargoId, ReviewInput reviewInput);
}
