package tasks.calculator;

public class Calculator {
	
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int subtract(int a, int b) {
		int sum = a - b;
		return sum;
	}
	
	public static int multiply(int a, int b) {
		int sum = a * b;
		return sum;
	}
	
	public static double divide(double a, double b) {
		if (a > b || b == 0) {
			return 0;
		}else {
			double sum = a / b;
			return sum;
		}

	}
	
}
