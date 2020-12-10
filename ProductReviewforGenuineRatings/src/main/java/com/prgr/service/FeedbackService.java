package com.prgr.service;

import java.util.List;

import com.prgr.model.Feedback;
import com.prgr.model.FeedbackTo;

public interface FeedbackService {
	public Feedback addFeedback(FeedbackTo feedbackTo);
	public List<Feedback> viewAllFeedback();
	public Feedback deleteFeedback(int feedbackId);
}
