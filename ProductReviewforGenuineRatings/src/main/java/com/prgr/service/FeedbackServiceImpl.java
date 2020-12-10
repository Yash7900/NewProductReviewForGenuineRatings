package com.prgr.service;
import java.util.List;





import com.prgr.dao.FeedbackDao;
import com.prgr.dao.FeedbackDaoImpl;
import com.prgr.model.Feedback;
import com.prgr.model.FeedbackTo;


public class FeedbackServiceImpl implements FeedbackService {
	private FeedbackDao fdao;
	public FeedbackServiceImpl() 
	{
		fdao= new FeedbackDaoImpl();
	}
	public Feedback addFeedback( FeedbackTo feedbackTo) {
		Feedback feedback=new Feedback(feedbackTo.getFeedbackAbout(),feedbackTo.getFeedbackDescription());
		return fdao.addFeedback(feedback);
	}

	public List<Feedback> viewAllFeedback() {
		
		return fdao.viewAllFeedback();
	}

	public Feedback deleteFeedback(int feedbackId) {
		return fdao.deleteFeedback(feedbackId);
	}
	
}
