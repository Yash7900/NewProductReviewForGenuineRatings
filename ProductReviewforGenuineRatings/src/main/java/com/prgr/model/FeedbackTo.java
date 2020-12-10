package com.prgr.model;

public class FeedbackTo {
	
	
	private int feedbackId;
	private String feedbackAbout;
	private String feedbackDescription;
	
	public FeedbackTo() {
		
	}

	public FeedbackTo(String feedbackAbout, String feedbackDescription) {
		super();
		//this.feedbackId = feedbackId;
		this.feedbackAbout = feedbackAbout;
		this.feedbackDescription = feedbackDescription;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackAbout() {
		return feedbackAbout;
	}

	public void setFeedbackAbout(String feedbackAbout) {
		this.feedbackAbout = feedbackAbout;
	}

	public String getFeedbackDescription() {
		return feedbackDescription;
	}

	public void setFeedbackDescription(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}

	@Override
	public String toString() {
		return "FeedbackTo [feedbackId=" + feedbackId + ", feedbackAbout=" + feedbackAbout + ", feedbackDescription="
				+ feedbackDescription + "]";
	}
	
	
	
}
