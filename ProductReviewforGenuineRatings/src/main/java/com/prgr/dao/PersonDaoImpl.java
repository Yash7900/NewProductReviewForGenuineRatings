package com.prgr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.prgr.exception.InvalidInputException;
import com.prgr.model.Person;
import com.prgr.utility.JPAUtility1;

public class PersonDaoImpl implements PersonDao{
	private EntityManager entityManager;
	final static Logger logger = Logger.getLogger(PersonDaoImpl.class);
	public PersonDaoImpl(){
		entityManager=JPAUtility1.getEntityManager();
	}
	public Person addPerson(Person person) {
		try{
			if(person.getPersonId()==0 || person.getFirstName()==null || person.getLastName()==null || person.getEmailId()==null || person.getPassword()==null){
				throw new InvalidInputException("Invalid Input entered");
			}
		}
		catch(InvalidInputException ex){
			ex.printStackTrace();
			
		}
		Logger.getLogger("addPerson into database.");
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();
		return person;
	}

public Person updatePerson(Person person) {
	try{
		if(person.getPersonId()==0 || person.getFirstName()==null || person.getLastName()==null || person.getEmailId()==null || person.getPassword()==null){
			throw new InvalidInputException("Invalid Input entered");
		}
	}
	catch(InvalidInputException ex){
		ex.printStackTrace();
		
	}
		entityManager.getTransaction().begin();
		entityManager.merge(person);
		entityManager.getTransaction().commit();
		return person;
	}

	public List<Person> viewAllPerson() {
		Query query=entityManager.createQuery("from Person");
		List<Person> list=query.getResultList();
		return list;
	}
	public Person viewPerson(int personId) {
		try{
			if(personId==0){
				throw new InvalidInputException("Invalid Input entered");
			}
		}
		catch(InvalidInputException ex){
			ex.printStackTrace();
			
		}
		Person person=entityManager.find(Person.class, personId);
		return person;
	}
	@Override
	public Person loginPerson(int personId) {
		Person person=entityManager.find(Person.class, personId);
		return person;
		
	}

	
	 
}
