package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// Creating a basic stream
		List<Integer> nums = new ArrayList<>();
		Stream<Integer> numStream = nums.stream();

		// making a list with data in it
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		numbers.stream()
//					.forEach(x -> System.out.println(x));
		
		//Map method
		List<Integer> mapNums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//List<Integer> expression = mapNums.stream().map(x -> 2*x + 3).collect(Collectors.toList());
		//System.out.println(expression);
		
		//Filter method
		List<String> stringList = new ArrayList<>();

		stringList.add("Jordan");
		stringList.add("Sarah");
		stringList.add("Bob");
		stringList.add("Carol");
		stringList.add("John");
		
//		List<String> name = stringList.stream().filter(s -> s.contains("o")).collect(Collectors.toList());
//		System.out.println(name);
		
		//Sorted method - Nums
		List<Integer> unorderedNums = Arrays.asList(9,3,6,8,2,4,1);
		List<Integer> orderNums = unorderedNums.stream().sorted().collect(Collectors.toList());
		System.out.println(orderNums);
		//Sorted method - Strings 
		List<String> animals = Arrays.asList("Lion", "Zebra", "Shark", "Fish", "Tiger", "Buffalo");
		//alphabetical order
		List<String> orderAnimals = animals.stream().sorted().collect(Collectors.toList());
		//reverse order
//		List<String> orderAnimals = animals.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(orderAnimals);
		
		
		//Reduce method
		List<Integer> ints = Arrays.asList(3,6,8,9);
		int ans = ints.stream().reduce((a, b) -> a+b).get();
		System.out.println(ans);
		
		List<Integer> integer = Arrays.asList(2,3,5,6,9,8);
		int answer = integer.stream().map(x -> x*x).reduce((a, b) -> a+b).get();
		System.out.println(answer);
	}
}
