package tasks.results;

public class Results {

	private static int physics = 120;
	private static int biology = 99;
	private static int chemistry = 70;
	private static int total;
	private static float percentage;
	
	public static int marksOverall() {
		System.out.println("Your physics score is " + physics);
		System.out.println("Your biology score is " + biology);
		System.out.println("Your chemistry score is " + chemistry);
		total = physics + chemistry + biology;
		System.out.println("Your total score is: " + total + "/450");
		return total;
	}
	
	public static double markPercentage() {
		System.out.println("Your physics score is " + physics);
		System.out.println("Your biology score is " + biology);
		System.out.println("Your chemistry score is " + chemistry);
		total = physics + chemistry + biology;
		percentage = (total*100)/450;
		System.out.println("Your average percentage across all tests is: " + percentage + "%");
		return percentage;
	}
}
