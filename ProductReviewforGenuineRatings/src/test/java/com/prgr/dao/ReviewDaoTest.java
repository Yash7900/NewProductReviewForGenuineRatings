package com.prgr.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.util.List;

import javax.persistence.Query;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.prgr.model.Review;
@FixMethodOrder(MethodSorters.NAME_ASCENDING
public class ReviewDaoTest {

	ReviewDao reviewDaoImpl;

	@Before
	public void init() {
		reviewDaoImpl = new ReviewDaoImpl();
	}
	@Ignore
	@Test
	public void testViewAllReviewRating() {
		List<Review> reviews = reviewDaoImpl.viewAllReviewRating(1);
		assertNotNull(reviews);
	}
	
	@Test
	public void testAddReviewRating() {
		Review reviewObj = new Review();
		reviewObj.setUserId(23);
		reviewObj.setReviewRate(4);
		reviewObj.setReviewDescrption("Good Product");
		Review review=reviewDaoImpl.addReviewRating(reviewObj);
		assertEquals(2, review.getProductId());
	}
	@Ignore
	@Test
	public void testDeleteReview()
	{
		Review review=reviewDaoImpl.deleteReview(2);
		Assert.assertNull(reviewDaoImpl.getClass());
	}

}
