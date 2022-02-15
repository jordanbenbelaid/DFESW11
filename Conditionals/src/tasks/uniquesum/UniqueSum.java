package tasks.uniquesum;

public class UniqueSum {

	public int methodOne(int a, int b, int c) {
		
		if(a == b && b == c) {
			return 0;
		} else if(a == b) {
			return c;
		} else if(a == c) {
			return b;
		} else if(c == b) {
			return a;
		} else {
			int total = a + b + c;
			return total;
		}
	}
}
