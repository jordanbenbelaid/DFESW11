package handler;

import java.util.ArrayList;
import java.util.List;

import domain.Person;

public class PersonManager {

	List<Person> persons = new ArrayList<>();
	
	public PersonManager() {}
	
	public PersonManager(List<Person> persons) {
		this.persons = persons;
	}
	
	public void addPerson(Person person) {
		persons.add(person);
	}
	
	public void removePerson(Person person) {
		persons.remove(person);
	}
	
	//find by name using a stream
	public void findByNameStream(String name) {
		this.persons.stream().forEach(p -> {if(p.getName().equalsIgnoreCase(name)) System.out.println(p);});
	}
	
	//find by name using an enhanced for loop
	public Person findByNameLoop(String name) {
		for(Person p : persons) {
			if(p.getName().equalsIgnoreCase(name)) {
				return p;
			}
		}
		return null;
	}
	
	//printing the list using a stream
	public void printStream() {
		this.persons.stream().forEach(p -> System.out.println(p));
	}
	
	//printing the list using an enhanced for loop
	public void print() {
		for(Person p : persons) {
			System.out.println(p);
		}
	}
}
