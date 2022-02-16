package runner;

import domain.Person;

public class Runner {

	public static void main(String[] args) {
		Person personOne = new Person();
		Person personTwo = new Person("Jordan", "Benbelaid");
		System.out.println(personTwo.getFirstName());
		personTwo.setFirstName("John");
		System.out.println(personTwo.getFirstName());
	}

}
