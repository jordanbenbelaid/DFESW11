package runner;

import java.util.ArrayList;
import java.util.List;

import domain.Person;
import handler.PersonManager;

public class Runner {

	public static void main(String[] args) {
		
		Person personOne = new Person("Jordan", 24, "Trainer");
		Person personTwo = new Person("Danielle", 29, "PA");
		Person personThree = new Person("Bob", 34, "Head of Admin");
		
		//Using the constructor in PersonManager, that takes a list as its parameter and printing it
//		List<Person> people = new ArrayList<>();
//		people.add(personOne);
//		people.add(personTwo);
//		people.add(personThree);
//		
//		PersonManager listCon = new PersonManager(people);
//		listCon.print();
		
		PersonManager pm = new PersonManager();
		
		pm.addPerson(personThree);
		pm.addPerson(personTwo);
		pm.addPerson(personOne);
		
		pm.print();
		//pm.findByNameStream("JORDAN");
		//System.out.println(pm.findByNameLoop("Jordan"));
		//pm.printStream();

	}

}
