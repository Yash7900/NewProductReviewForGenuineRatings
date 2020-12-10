package com.prgr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;



import com.prgr.model.Person;
import com.prgr.utility.JPAUtility1;

public class PersonDaoImpl implements PersonDao{
	private EntityManager entityManager;
	
	public PersonDaoImpl(){
		entityManager=JPAUtility1.getEntityManager();
	}
	public Person addPerson(Person person) {
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();
		return person;
	}

public Person updatePerson(Person person) {
		
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
		Person person=entityManager.find(Person.class, personId);
		return person;
	}
	@Override
	public Person loginPerson(int personId) {
		Person person=entityManager.find(Person.class, personId);
		return person;
		
	}

	
	 
}
