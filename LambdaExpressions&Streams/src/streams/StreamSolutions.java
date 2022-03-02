package streams;

import java.util.Arrays;
import java.util.List;

public class StreamSolutions {

	public static void main(String[] args) {
		//name list
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		//number list
		List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12);
		List<Integer> numbersTwo = Arrays.asList(3, 4, 7, 8, 12);
		
		
		//Question 1 - first solution
//		names.stream().forEach(name -> {if(!name.equalsIgnoreCase("James")) System.out.println("Hello " + name);});
		//Question 1 - second solution
		names.stream().forEach(name -> {if(!name.equalsIgnoreCase("James")) System.out.println("Hello " + name); 
										else System.out.println(name);});
		
		//Question 2 
		System.out.println(numbers.stream().reduce((a,b) -> a * b).get());
		
		//Question 3 part 1
		System.out.println(numbersTwo.stream().max((a,b) -> Integer.compare(a, b)));
		//System.out.println(numbersTwo.stream().max(Integer::compare));
		
		//Question 3 part 2
		System.out.println(numbersTwo.stream().min((a,b) -> Integer.compare(a, b)));
		//System.out.println(numbersTwo.stream().min(Integer::compare));
		
		//Question 3 part 3
		numbersTwo.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
		
		//Question 3 part 4
		numbersTwo.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.println(x));
		
		//Question 3 part 5
		System.out.println(numbersTwo.stream().reduce((a,b) -> a + b).get());
		
		//Question 3 part 6
		System.out.println(numbersTwo.stream().map(x -> x * x).filter(x -> x % 2 != 0).min((a,b) -> Integer.compare(a, b)));
		}

	}


