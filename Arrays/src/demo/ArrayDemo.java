package demo;

public class ArrayDemo {

	public static void main(String[] args) {
		// SINGLE DIMENSIONAL ARRAYS
		// first method, creates empty array
		int[] ageArray;

		// second method, creates array with values in it
		int[] array = { 24, 35, 46, 57, 68 };
		String[] stringArray = { "Hello", "My", "Name", "Is", "Jordan" };
		// printing the array out
		for (String s : stringArray) {
			System.out.println(s);
		}

		// third method, creates array of a specific size
		int[] arraySize = new int[5];
		// adding values to array
		arraySize[0] = 20;

		// MULTI DIMENSIONAL ARRAYS
		// first method
		int[][] multiArray;

		// second method
		int[][] arrayMulti = { { 23, 2, 10 }, { 49 }, { 6, 18 } };

		// third method
		// [3] means there are 3 arrays, [2] indicates how many values per array
		int[][] arrayset = new int[3][2];
		// adding values to a multi dimensional array ([2][0] is the THIRD array, at the
		// firts position)
		arrayset[2][0] = 21;
		
		//////////////////////////////////////////////////////////////

		int[][] loopArray = { { 23, 2, 10 }, { 49, 4, 10 }, { 6, 18, 77 } };
		
		//Nested for loop
		for(int i = 0; i < loopArray.length; i++) {
			for(int j = 0; j < loopArray[i].length; j++) {
				System.out.println(loopArray[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		//Nested foreach loop
		for(int[] a : loopArray) {
			for(int b : a) {
				System.out.println(b);
			}
			System.out.println();
		}
		
		//for and foreach loop together
		for(int i : array) {
			for(int j = 0; j < array.length; j++) {
				if(array[j] == i) {
					System.out.println(i);
				}
			}
		}
		
		
		
		
	}

}
