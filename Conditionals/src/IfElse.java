
public class IfElse {

	public static void main(String[] args) {
//		int a = 13;
//
//		if (a == 12) {
//			System.out.println("Correct!");
//		} 
//		else {
//			System.out.println("Wrong, try again");
//		}
		
//		int num = 100;
//		
//		if(num <= 50) {
//			System.out.println("Wrong once");
//		} else if(num <= 80) {
//			System.out.println("Wrong again");
//		} else {
//			System.out.println("Finally got it right");
//		}
		
		
		String day = "Sunday";

        switch(day) {
            case "Monday":
                System.out.println("Monday you can fall apart");
                break;
            case "Tuesday":
                System.out.println("Tuesday,");
                break;
            case "Wednesday":
                System.out.println("Wednesday break my heart");
                break;
            case "Thursday":
                System.out.println("Oh, Thursday doesn't even start");
                break;
            case "Friday":
                System.out.println("It's Friday I'm in love");
                break;
            case "Saturday":
                System.out.println("Saturdaaaay wait");
                break;
            case "Sunday":
                System.out.println("Sunday always comes too late");
                break;
            default:
                System.out.println("You need to listen to The Cure");
                break;
        }

	}
}
