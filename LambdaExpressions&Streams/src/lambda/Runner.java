package lambda;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();

		stringList.add("Jordan");
		stringList.add("Sarah");
		stringList.add("Bob");
		stringList.add("Carol");
		stringList.add("John");
		
		//simple print everything in list
//		stringList.forEach(words -> System.out.println(words));
		
		//Method reference
		//Essentially removes the need to add a variable and arrow from the lambda expression, as it creates 
		//a random variable we do not need to know when using '::'
//		stringList.forEach(System.out::println);
		
		//Logic in list
		stringList.forEach(words -> {if(!words.equalsIgnoreCase("Jordan")) System.out.println(words);});
		
	}

}
