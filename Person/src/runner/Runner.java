package runner;

import domain.Person;
import domain.Pet;
import handler.PersonManager;

public class Runner {

	public static void main(String[] args) {
		
		Person personOne = new Person("Jordan", 24, "Trainer");
		Person personTwo = new Person("Danielle", 29, "PA");
		Person personThree = new Person("Bob", 34, "Head of Admin");
		
		Pet shark = new Pet("Shark", "Sharky", 30, "Fish");
		Pet dog = new Pet("Dog - Labrador", "Buddy", 3, "Dog food");
		
		personOne.addPet(shark);
		personOne.addPet(dog);
		
		personTwo.addPetTwo("Emu", "Chonky", 5, "Omnivore");
		
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
