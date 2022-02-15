package com.qa;

import com.qa.customer.Customer;

public class Runner {

	public static void main(String[] args) {
		//instantiating an object
		Customer customerOne = new Customer(); 
		
		//customerOne object has a first name of Jordan and a surname of Benbelaid
		customerOne.setFirstName("Jordan");
		customerOne.setSurname("Benbelaid");
		
		//show what is stored
		System.out.println(customerOne.getFirstName() + " " + customerOne.getSurname());
		
		//With toString method
		System.out.println(customerOne);
		
		
		System.out.println("========================================================");
		
		//static class members
		System.out.println(Customer.getNumberOfPeople());
		
		Customer customerTwo = new Customer();
		
		System.out.println(Customer.getNumberOfPeople());
		
	}

}
