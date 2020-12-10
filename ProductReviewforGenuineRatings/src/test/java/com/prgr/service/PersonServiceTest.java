package com.prgr.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.prgr.exception.InvalidInputException;
import com.prgr.model.Person;
import com.prgr.model.PersonTo;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonServiceTest {

	PersonService personsevice;

	@Before
	public void setUp() {
		personsevice = new PersonServiceImpl();
	}

	@Test
	public void testAddPerson() throws InvalidInputException {
		PersonTo personObj = new PersonTo();
		personObj.setPersonId(12);
		personObj.setFirstName("raj");
		personObj.setLastName("khan");
		personObj.setEmailId("raj@gmail.com");
		personObj.setAddress("Mumbai");
		personObj.setPhoneNumber(5458484L);
		personObj.setRole("user");
		personObj.setPassword("abc1234");
		Person person = personsevice.addPerson(personObj);
		assertEquals("raj", person.getFirstName());
	}

	@Test
	public void testUpdatePerson() throws InvalidInputException {
		PersonTo personObj = new PersonTo();
		personObj.setPersonId(12);
		personObj.setFirstName("raj");
		personObj.setLastName("sawant");
		personObj.setEmailId("ab@gmail.com");
		personObj.setAddress("pune");
		personObj.setPhoneNumber(5458484L);
		personObj.setRole("user");
		personObj.setPassword("abc1234");
		Person person = personsevice.updatePerson(personObj);
		assertEquals("raj", person.getFirstName());
	}

	@Test
	public void testViewAllPerson() {
		List<Person> person = personsevice.viewAllPerson();
		assertNotNull(person);
	}


}
