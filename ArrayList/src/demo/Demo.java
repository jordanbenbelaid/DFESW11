package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		//CAN STORE A LIST IN A LIST IF YOU WANT
		List<List> test = new ArrayList<>();
		List<Integer> nums = new ArrayList<>();
		List<String> s = new ArrayList<>();
		
		s.add("Hi");
		s.add("Hello");
		s.add("Bonjour");
		
		//test.add(nums);
		test.add(s);
		
		//System.out.println(test);
		
		//Adding to a list
		nums.add(3);
		nums.add(9);
		nums.add(192);
		
		//Getting from a list
		System.out.println(nums.get(2));
		
		//Setting an index in a list
		nums.set(2, 20);
		System.out.println(nums);
		
		//Removing from a list
		nums.remove(2);
		System.out.println(nums);
		
		//Size of a list
		System.out.println(nums.size());
		
		//Clearing a list
		nums.clear();
		System.out.println(nums);
		
		//Iterating through a list (For loop)
		for(int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		//Iterating through a list (ForEach loop)
		for(String i : s) {
			System.out.println(i);
		}
		
	}
	
}
