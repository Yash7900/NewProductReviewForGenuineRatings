package com.prgr.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.prgr.model.Feedback;
import com.prgr.model.FeedbackTo;

public class FeedbackServiceTest {

	FeedbackService feedbackSevice;

	@Before
	public void setUp() throws Exception {
		feedbackSevice = new FeedbackServiceImpl();
	}

	@Test
	public void testAddFeedback() {
		FeedbackTo feedbackObj = new FeedbackTo();
		feedbackObj.setFeedbackAbout("System");
		feedbackObj.setFeedbackDescription("Good");
		Feedback feedback = feedbackSevice.addFeedback(feedbackObj);
		assertEquals("System", feedback.getFeedbackAbout());
	}

	@Test
	public void testViewAllFeedback() {
		List<Feedback> feedbacks=feedbackSevice.viewAllFeedback();
		assertNotNull(feedbacks);
	}
	@Ignore
	@Test
	public void testDeleteFeedback() {
		Feedback feedback=feedbackSevice.deleteFeedback(2);
		assertNotNull(feedback.getFeedbackId());
		//fail("Not yet implemented");
	}

}
