package com.prgr.service;

import java.util.List;

import com.prgr.model.Review;
import com.prgr.model.ReviewTo;

public interface ReviewService {
	public Review addReviewRating(ReviewTo reviewTo);
	public Review deleteReview(int reviewId);
	public int getOverallRating(int productId);
	public List<Review> viewAllReviewRating(int productId);
}
