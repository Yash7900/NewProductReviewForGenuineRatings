package com.prgr.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.prgr.model.Feedback;

public class FeedbackDaoTest {

FeedbackDao feedbackDao;
	
	@Before
	public void init()
	{
		feedbackDao=new FeedbackDaoImpl();
	}
	
	@Test
	public void testviewAllFeedback() {
		
		List<Feedback> feedback=feedbackDao.viewAllFeedback();
		assertNotNull(feedback);
	}
	
	@Test
	public void testAddFeedback() {
		Feedback feedbackObj=new Feedback();
		feedbackObj.setFeedbackAbout("System");
		feedbackObj.setFeedbackDescription("Good System");
		Feedback feedback=feedbackDao.addFeedback(feedbackObj);
		assertEquals("System",feedback.getFeedbackAbout());
	}
	@Test
	public void testdeleteFeedback(){
		Feedback feedback=feedbackDao.deleteFeedback(4);
		assertNotNull(feedback.getFeedbackId());
		//assertNotSame("Good System",feedback.getFeedbackDescription());
		
	}
}
