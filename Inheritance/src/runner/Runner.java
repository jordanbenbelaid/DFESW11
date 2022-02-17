package runner;

import java.util.ArrayList;
import java.util.List;

import demo.Animals;
import demo.Tiger;

public class Runner {

	public static void main(String[] args) {
		Animals.tester();
		
		Tiger tiger = new Tiger("Deer", 4, true);
		System.out.println(tiger);
		tiger.eat();
		
		List<Integer> test = new ArrayList<>();
	}

}
