package com.prgr.service;

import java.util.List;

import com.prgr.dao.PersonDao;
import com.prgr.dao.PersonDaoImpl;
import com.prgr.model.Person;
import com.prgr.model.PersonTo;

public class PersonServiceImpl implements PersonService {
	
	private PersonDao personDao;
	
	public PersonServiceImpl() {
		personDao =new PersonDaoImpl() ;
	}

	public Person addPerson(PersonTo personTo) {
		Person person=new Person(personTo.getPersonId(),personTo.getFirstName(),personTo.getLastName(),personTo.getAddress(),personTo.getPhoneNumber(),personTo.getEmailId(),personTo.getPassword(),"User");
		personDao.addPerson(person);
		return person;
	}

	public Person updatePerson(PersonTo personTo) {
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
			 login=true;
		}
		else{
			throw new Exception();
		}
		
		}
		catch(Exception ex){
			System.out.println("Invalid Credentials");
			
		}
		return login;
	}

	@Override
	public boolean loginAdmin(String adminUsername, String adminPassword) {
		boolean login=false; 
		try{
			if(adminUsername.equals("admin")&& adminPassword.equals("12345")){
				 login=true;
			}
			else{
				throw new Exception();
			}
			
			}
			catch(Exception ex){
				System.out.println("Invalid Credentials");
				
			}
			return login;
	}

}
