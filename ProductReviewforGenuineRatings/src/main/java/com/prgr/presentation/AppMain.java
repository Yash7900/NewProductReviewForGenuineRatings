package com.prgr.presentation;

import java.util.Map;
import java.util.Scanner;

import com.prgr.model.FeedbackTo;
import com.prgr.model.PersonTo;
import com.prgr.model.Product;
import com.prgr.model.ProductTo;
import com.prgr.model.ReviewTo;
import com.prgr.service.FeedbackService;
import com.prgr.service.FeedbackServiceImpl;
import com.prgr.service.PersonService;
import com.prgr.service.PersonServiceImpl;
import com.prgr.service.ProductService;
import com.prgr.service.ProductServiceImpl;
import com.prgr.service.ReviewService;
import com.prgr.service.ReviewServiceImpl;

public class AppMain {
	
	public static void main(String[] args) throws Exception{
		PersonService pservice = new PersonServiceImpl();
		ProductService productService = new ProductServiceImpl();
		ReviewService reviewService = new ReviewServiceImpl();
		FeedbackService feedbackService=new FeedbackServiceImpl();

		Scanner scanner = new Scanner(System.in); /* Integer input */
		Scanner scannerString = new Scanner(System.in); /* String input */
		Scanner option = new Scanner(System.in); /* option selection */
		Scanner scannerInt=new Scanner(System.in);
		String exit = "";
		/* ----- Selecting Role------- */
		do{
		System.out.println("Product Review For Genuine Rating");
		System.out.println("----------------------------------");
		System.out.println("Select the person role");
		System.out.println("1.Admin\n2.User\n3.Exit");
		int personRole = option.nextInt();
		
		switch (personRole) {
		case 1:
			boolean out=false;
			do{
			System.out.println("Admin Page");
			System.out.println("1.Login\n2.Exit");
			String adminUsername = "admin";
			String adminPassword = "1234";
			int adminOption = option.nextInt();
			switch (adminOption) {
			/* ---------------------Admin Page----------------------- */
			case 1:
				
				break;
			case 2:
				break;
			}
			System.out.println("For Exit enter 'y' or 'n':");
			exit=scannerString.next();
			
			if(exit=="y"){
				 out=true;
			}
			else{
				out=false;
			}
			}while(out);
			System.out.println("1");
			break;
		case 2 :
			break;
		case 3:
			System.out.println("For Exit enter 'y' or 'n':");
			exit=scannerString.next();
			System.exit(0);
		
		}
		}while(exit=="y");
		scanner.close();
		scannerString.close();
		option.close();
		scannerInt.close();
	}

}
