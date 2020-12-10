package com.prgr.model;

public class PersonTo {

	private int personId;
	private String firstName;
	private String lastName;
	private String address;
	private Long phoneNumber;
	private String emailId;
	private String password;
	private String role;

	public PersonTo() {

	}

	public PersonTo(int personId, String firstName, String lastName, String address, Long phoneNumber, String emailId,
			String password, String role) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
		this.role = role;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "PersonTo [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", password=" + password
				+ ", role=" + role + "]";
	}

}
