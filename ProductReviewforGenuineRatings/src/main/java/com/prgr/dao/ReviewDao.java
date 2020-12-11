package com.prgr.dao;

import java.util.List;

import com.prgr.model.Review;

public interface ReviewDao {
	public Review addReviewRating(Review review);
	public Review deleteReview(int reviewId);
	public int getOverallRating(int productId);
	public List<Review> viewAllReviewRating(int productId);
	public Review reviewExists(int userId,int productId);
	}
