package com.prgr.service;
import java.util.List;

import org.apache.log4j.Logger;

import com.prgr.dao.FeedbackDao;
import com.prgr.dao.FeedbackDaoImpl;
import com.prgr.model.Feedback;
import com.prgr.model.FeedbackTo;


public class FeedbackServiceImpl implements FeedbackService {
	private FeedbackDao fdao;
	final static Logger logger = Logger.getLogger(FeedbackServiceImpl.class);
	public FeedbackServiceImpl() 
	{
		fdao= new FeedbackDaoImpl();
	}
	public Feedback addFeedback( FeedbackTo feedbackTo) {
		logger.info("Adding Feedbacks");
		Feedback feedback=new Feedback(feedbackTo.getFeedbackAbout(),feedbackTo.getFeedbackDescription());
		return fdao.addFeedback(feedback);
	}

	public List<Feedback> viewAllFeedback() {
		logger.info("Viewing all the Feedbacks");
		return fdao.viewAllFeedback();
	}

	public Feedback deleteFeedback(int feedbackId) {
		logger.info("Deleting Feedbacks");
		return fdao.deleteFeedback(feedbackId);
	}
	
}
