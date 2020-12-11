package com.prgr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prgr.model.Review;
import com.prgr.utility.JPAUtility1;

public class ReviewDaoImpl implements ReviewDao{
	private EntityManager entityManager;
	
	public ReviewDaoImpl(){
		entityManager=JPAUtility1.getEntityManager();
	}
	
	public Review addReviewRating(Review review) {
		entityManager.getTransaction().begin();
		entityManager.persist(review);
		entityManager.getTransaction().commit();
		return review;
	}
	
	public Review deleteReview(int reviewId) {
		entityManager.getTransaction().begin();
		Review pr=entityManager.find(Review.class, reviewId);
		entityManager.remove(pr);
		entityManager.getTransaction().commit();
		return pr;
	}

	public int getOverallRating(int productId) {
		Query query=entityManager.createQuery("from Review where Product_Id=?");
		query.setParameter(1,productId);
		int overallRating=query.getMaxResults();
		return overallRating;
	}

	public List<Review> viewAllReviewRating(int productId) {
		Query query =entityManager.createQuery("Select Review_Rate,Review_Description from Review where Product_Id=?");
		query.setParameter(1,productId);
		List<Review> list1=query.getResultList();
		return list1;
	}

	@Override
	public Review reviewExists(int userId, int productId) {
		Review review=entityManager.find(Review.class,userId);
		return review;
	}

	}
