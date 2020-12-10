package com.prgr.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.prgr.model.Review;
import com.prgr.model.ReviewTo;

public class ReviewServiceTest {
	ReviewService reviewServiceImpl;

	@Before
	public void setUp() throws Exception {
		reviewServiceImpl = new ReviewServiceImpl();
	}
	
	@Test
	public void testAddReview() {
		ReviewTo reviewObj = new ReviewTo();
		reviewObj.setReviewId(1);
		reviewObj.setUserId(5);
		reviewObj.setProductId(2300);
		reviewObj.setReviewRate(45);
		reviewObj.setReviewDescrption("j");
		Review review = reviewServiceImpl.addReviewRating(reviewObj);
		assertEquals(5, review.getUserId());
		
	}

	@Test
	public void testDeleteReview() {
		// fail("Not yet implemented");
	}

	@Test
	public void testViewAllRatings() {
		//List<Review> reviews = reviewServiceImpl.viewAllReviewRating(2300);
		//assertNotNull(reviews);
	}

}
