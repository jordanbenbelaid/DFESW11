package tasks.flowchart;

public class Flowchart {

	public static void main(String[] args) {
		
		System.out.println(methodOne(10, 2, false));

	}
	
	public static int methodOne(int a, int b, boolean bool) {
		if(bool == true) {
			int sum = a + b;
			return sum;
		}else {
			int sum = a * b;
			return sum;
		}
	}
	

}
