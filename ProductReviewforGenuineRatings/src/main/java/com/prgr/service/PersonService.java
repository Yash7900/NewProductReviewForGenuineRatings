package com.prgr.service;

import java.util.List;

import com.prgr.model.Person;
import com.prgr.model.PersonTo;

public interface PersonService {
	public boolean loginUser(int personId,String emailId,String password);
	public boolean loginAdmin(String adminUsername,String adminPassword);
	public Person addPerson(PersonTo personTo);
	 public Person updatePerson(PersonTo personTo);
	 public List<Person> viewAllPerson();
}
