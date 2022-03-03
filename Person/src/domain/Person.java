package domain;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private int age;
	private String jobTitle;
	private List<Pet> pets =  new ArrayList<>();
	
	public Person() {}
	
	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public Person(String name, int age, String jobTitle, List<Pet> pets) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.pets = pets;
	}

	public void addPet(Pet pet) {
		this.pets.add(pet);
	}
	
	public void addPetTwo(String type, String name, int age, String food) {
		Pet pet = new Pet(type, name, age, food);
		pets.add(pet);
	}
	
	public void removePet(Pet pet) {
		this.pets.remove(pet);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "\nPerson: \nname = " + name + "\nage = " + age + "\njobTitle = " + jobTitle + "\nAll of " 
					+ name + "'s pets:" + pets;
	}
	
	
}
