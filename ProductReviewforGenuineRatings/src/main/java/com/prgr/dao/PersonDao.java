package com.prgr.dao;

import java.util.List;

import com.prgr.exception.InvalidInputException;
import com.prgr.model.Person;

public interface PersonDao {
	public Person loginPerson(int personId);
	public Person addPerson(Person person)throws InvalidInputException;
	 public Person updatePerson(Person person)throws InvalidInputException;
	 public List<Person> viewAllPerson();
	 public Person viewPerson(int personId)throws InvalidInputException;

}
