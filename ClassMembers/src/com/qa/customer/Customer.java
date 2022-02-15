package com.qa.customer;

public class Customer {

	private String firstName;
	private String surname;
	private static int numberOfPeople = 0; 
	
	public Customer() {
		numberOfPeople++;
	}
	
	//static int method
	public static int getNumberOfPeople() {
		return numberOfPeople;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "firstName: " + firstName + ", surname: " + surname;
	}
	
	//"Customer [firstName=Jordan, surname=Benbelaid]"
}
