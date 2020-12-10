package com.prgr.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.prgr.exception.InvalidInputException;
import com.prgr.model.Person;

public class PersonDaoTest {
	PersonDao persondaoimpl;

	@Before
	public void init() {
		persondaoimpl = new PersonDaoImpl();
	}

	@Test
	public void testviewAllPerson() {

		List<Person> person = persondaoimpl.viewAllPerson();
		assertNotNull(person);
	}
	
	@Test
	public void testAddPerson() throws InvalidInputException {
		Person personObj = new Person();
		personObj.setPersonId(15);
		personObj.setFirstName("Abc");
		personObj.setLastName("xyz");
		personObj.setAddress("Dadar");
		personObj.setPhoneNumber(7869743);
		personObj.setEmailId("Abc@gmail.com");
		personObj.setPassword("Abc");
		personObj.setRole("User");
		Person person = persondaoimpl.addPerson(personObj);
		assertEquals("Abc", person.getFirstName());
	}
	
	@Test
	public void testUpdatePerson() throws InvalidInputException
	{
		Person personObj = new Person();
		personObj.setFirstName("Abc");
		personObj.setLastName("xyz");
		personObj.setEmailId("Abc123@gmail.com");
		personObj.setAddress("Dadar");
		personObj.setPhoneNumber(7869743);
		personObj.setRole("User");
		personObj.setPassword("Abc");
		Person person = persondaoimpl.updatePerson(personObj);
		assertEquals("Abc123@gmail.com", person.getEmailId());
	}
	
}
