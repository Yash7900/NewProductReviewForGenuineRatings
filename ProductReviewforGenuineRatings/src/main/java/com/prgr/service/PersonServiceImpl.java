package com.prgr.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.prgr.dao.PersonDao;
import com.prgr.dao.PersonDaoImpl;
import com.prgr.exception.InvalidInputException;
import com.prgr.model.Person;
import com.prgr.model.PersonTo;

public class PersonServiceImpl implements PersonService {
	final static Logger logger = Logger.getLogger(PersonServiceImpl.class);
	private PersonDao personDao;
	
	public PersonServiceImpl() {
		personDao =new PersonDaoImpl() ;
	}

	public Person addPerson(PersonTo personTo) throws InvalidInputException {
		logger.info("Adding Person details");
		Logger.getLogger("addfeedback"+ PersonServiceImpl.class);
		Person person=new Person(personTo.getPersonId(),personTo.getFirstName(),personTo.getLastName(),personTo.getAddress(),personTo.getPhoneNumber(),personTo.getEmailId(),personTo.getPassword(),"User");
		personDao.addPerson(person);
		return person;
	}

	public Person updatePerson(PersonTo personTo) throws InvalidInputException {
		logger.info("Viewing person details");
		Person person=new Person(personTo.getPersonId(),personTo.getFirstName(),personTo.getLastName(),personTo.getAddress(),personTo.getPhoneNumber(),personTo.getEmailId(),personTo.getPassword(),"User");
		return personDao.updatePerson(person);
	}

	public List<Person> viewAllPerson() {

		return personDao.viewAllPerson();
	}

	@Override
	public boolean loginUser(int personId, String emailId, String password) {
		boolean login=false; 
		Person validatePerson=personDao.loginPerson(personId);
		try{
		if(emailId.equals(validatePerson.getEmailId())&& password.equals(validatePerson.getPassword())){
			logger.debug("User login successful"); 
			login=true;
		}
		else{
			throw new Exception();
		}
		
		}
		catch(Exception ex){
			logger.debug("Invalid Credentials");
			
		}
		return login;
	}

	@Override
	public boolean loginAdmin(String adminUsername, String adminPassword) {
		boolean login=false; 
		try{
			if(adminUsername.equals("admin")&& adminPassword.equals("12345")){
				logger.debug("User login successful");  
				login=true;
			}
			else{
				throw new Exception();
			}
			
			}
			catch(Exception ex){
				logger.debug("Invalid Credentials");
				
			}
			return login;
	}

}
