package com.prgr.model;

public class ReviewTo {
	
	private int reviewId;
	private int productId;	
	private int userId;
	private int reviewRate;
	private String reviewDescrption;
	
	public ReviewTo() {
		
	}

	public ReviewTo(int productId, int userId, int reviewRate, String reviewDescrption) {
		super();
		//this.reviewId = reviewId;
		this.productId = productId;
		this.userId = userId;
		this.reviewRate = reviewRate;
		this.reviewDescrption = reviewDescrption;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getReviewRate() {
		return reviewRate;
	}

	public void setReviewRate(int reviewRate) {
		this.reviewRate = reviewRate;
	}

	public String getReviewDescrption() {
		return reviewDescrption;
	}

	public void setReviewDescrption(String reviewDescrption) {
		this.reviewDescrption = reviewDescrption;
	}

	@Override
	public String toString() {
		return "ReviewTo [reviewId=" + reviewId + ", productId=" + productId + ", userId=" + userId + ", reviewRate="
				+ reviewRate + ", reviewDescrption=" + reviewDescrption + "]";
	}
	
	
}
