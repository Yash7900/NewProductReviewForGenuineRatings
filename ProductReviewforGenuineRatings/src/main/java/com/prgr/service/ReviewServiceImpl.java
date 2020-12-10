package com.prgr.service;
import java.util.List;

import org.apache.log4j.Logger;

import com.prgr.dao.ReviewDao;
import com.prgr.dao.ReviewDaoImpl;
import com.prgr.model.Review;
import com.prgr.model.ReviewTo;


public class ReviewServiceImpl implements ReviewService {
	ReviewDao reviewDao;
	final static Logger logger = Logger.getLogger(ReviewServiceImpl.class);
	public ReviewServiceImpl(){
		reviewDao=new ReviewDaoImpl();
	}

	
	public Review deleteReview(int reviewId) {
		logger.info("Deleting review details");
		return null;
	}

	public int getOverallRating(int productId) {
		logger.info("Retriving overall ratings");
		return 0;
	}

	public List<Review> viewAllReviewRating(int productId) {
		logger.info("Viewing overall review ratings");
		// TODO Auto-generated method stub
		return null;
	}


	public Review addReviewRating(ReviewTo reviewTo) {
		Review review=new Review(reviewTo.getProductId(),reviewTo.getUserId(),reviewTo.getReviewRate(),reviewTo.getReviewDescrption());
		return reviewDao.addReviewRating(review);
	}

}
	