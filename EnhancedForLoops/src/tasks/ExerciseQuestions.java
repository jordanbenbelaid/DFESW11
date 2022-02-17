package tasks;

public class ExerciseQuestions {

	int arrayInt[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
	String array[] = { "Hello", "Hi", "Bonjour", "Guten tag", "Ciao" };
	
	// Question 1
	public void questionOne() {
		
		for (String s : array) {
			System.out.println(s);
		}
	}

	// Question 2
	public void questionTwo() {
		
		for (int i : arrayInt) {
			System.out.println(i);
		}
	}

	// Question 3
	public Boolean questionThree(int i) {
		
		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Question 4
	public void questionFour() {
		
		for (int i : arrayInt) {
			
			questionThree(i);
			
			if (questionThree(i) == true) {
				System.out.println(i * i * i);
			} else {
				System.out.println(i * i);
			}
		}
	}
}
