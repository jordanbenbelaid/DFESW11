package domain;

public class Person {

	private String firstName;
	private String surname;
	private String favFood;
	private int age;
	
	//Getter - allows you to get the information of an attribute from a different class
	public String getFirstName() {
		return this.firstName;
	}
	
	//Setter - allows you to set the information of an attribute from a different class
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//default constructor
	public Person() {
		
	}
	
	//All argument constructor
	public Person(String firstName, String surname, String favFood, int age) {
		this.firstName = firstName;
		this.surname = surname;
		this.favFood = favFood;
		this.age = age;
	}
	
	public Person(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", surname=" + surname + ", favFood=" + favFood + ", age=" + age
				+ "]";
	}
}
