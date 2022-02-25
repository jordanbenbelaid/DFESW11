package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap; 	//keeps the order
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaps {

	public static void main(String[] args) {
		//Map<String, String> worldFoods = new LinkedHashMap<>();		Keeps the order	
		Map<String, String> worldFoods = new HashMap<>();
		
		//How to use a list as the value
		Map<String, List<String>> tester = new HashMap<>();
		List<String> cities = new ArrayList<>();
		cities.add("Manchester");
		cities.add("London");
		cities.add("Liverpool");
		
		tester.put("England", cities);
		System.out.println(tester);
		
		
		//Add   -- the key(left side) must be unique, or it just takes the last value, values can be duplicated
		worldFoods.put("Italy", "Pizza");
		worldFoods.put("Japan", "Ramen");
		worldFoods.put("Germany", "Beer");
		worldFoods.put("China", "Thousand year egg");
		worldFoods.put("Spain", "Paella");
		
		//Get   -- always use the key (left side)
		System.out.println(worldFoods.get("Spain"));
		
		//Remove (using the key), Clear, Size work exactly the same way as hash sets
		
		//Printing keyset --- using the key (left column)
		for(String i : worldFoods.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("\n========================================================\n");
		
		//Printing value --- using the values (right column)
		for(String i : worldFoods.values()) {
			System.out.println(i);
		}
		
		System.out.println("\n========================================================\n");
		
		//Printing the entryset 
		for(Entry<String, String> i : worldFoods.entrySet()) {
			System.out.println(i);
		}
		
		
		//This also works
		System.out.println(worldFoods);
	}
	

}
