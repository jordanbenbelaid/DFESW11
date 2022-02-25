package hashsets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {
		//List<String> strings = new ArrayList<>();
		Set<String> hashSet = new HashSet<>();
		
		//ADD
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("B");		//This would overwrite the previous B because we cant have duplicates
		hashSet.add("E");
		
//		for(String i : hashSet) {
//			System.out.println(i);
//		}
		
		//isEmpty & size
		System.out.println(hashSet.isEmpty());
		System.out.println(hashSet.size());
		
		//Remove
		//hashSet.remove("E");
		
		//Clear
		//hashSet.clear();
		
		//Contains
		System.out.println(hashSet.contains("A"));
		
		//Iterator
		Iterator<String> setIterator = hashSet.iterator();
		while(setIterator.hasNext()) {
			String s = setIterator.next();
			if(s.equals("C")) {
				setIterator.remove();
			}
		}
		System.out.println(hashSet);
	}

}
