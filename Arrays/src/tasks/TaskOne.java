package tasks;

public class TaskOne {

	public int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	public int[] arrayTwo = new int[10];
	
	public void questionOne() {
		for(int i : arrayOne) {
			System.out.println(i);
		}
	}
	
	public void questionTwo() {
		for(int i = 1; i < arrayTwo.length + 1; i++) {
			System.out.println(i*10);
		}
	}

}
