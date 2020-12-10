package com.prgr.service;
import java.util.List;

import com.prgr.dao.ReviewDao;
import com.prgr.dao.ReviewDaoImpl;
import com.prgr.model.Review;
import com.prgr.model.ReviewTo;


public class ReviewServiceImpl implements ReviewService {
	ReviewDao reviewDao;
	
	public ReviewServiceImpl(){
		reviewDao=new ReviewDaoImpl();
	}

	
	public Review deleteReview(int reviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getOverallRating(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Review> viewAllReviewRating(int productId) {
		// TODO Auto-generated method stub
		return null;
	}


	public Review addReviewRating(ReviewTo reviewTo) {
		Review review=new Review(reviewTo.getProductId(),reviewTo.getUserId(),reviewTo.getReviewRate(),reviewTo.getReviewDescrption());
		return reviewDao.addReviewRating(review);
	}

}
	