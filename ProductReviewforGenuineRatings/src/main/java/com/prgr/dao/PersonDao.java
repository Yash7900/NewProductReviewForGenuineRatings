package com.prgr.dao;

import java.util.List;

import com.prgr.model.Person;

public interface PersonDao {
	public Person loginPerson(int personId);
	public Person addPerson(Person person);
	 public Person updatePerson(Person person);
	 public List<Person> viewAllPerson();
	 public Person viewPerson(int personId);

}
