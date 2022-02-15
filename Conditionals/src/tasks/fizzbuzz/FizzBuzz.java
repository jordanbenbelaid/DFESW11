package tasks.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
	//	System.out.println(fizzBuzz(8));
		fizzBuzzVoid(15);
	}

	public static String fizzBuzz(int num) {
		if(num % 3 == 0) {
			return "Fizz";
		} else if(num % 5 == 0) {
			return "Buzz";
		} else if (num % 15 == 0) {
			return "FizzBuzz";
		}
		return String.valueOf(num);
	}

	
	public static void fizzBuzzVoid(int num) {
		if(num % 15 == 0) {
			System.out.println("FizzBuzz");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println(num);
		}
		
	}
	
}
