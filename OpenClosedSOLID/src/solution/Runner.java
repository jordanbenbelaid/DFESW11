package solution;

public class Runner {

	public static void main(String[] args) {
		
		FormalGreeting formal = new FormalGreeting();
		CasualGreeting casual = new CasualGreeting();
		
		Greeter greeterFormal = new Greeter(formal);
		Greeter greeterCasual = new Greeter(casual);
		
		System.out.println(greeterFormal.greet());
		System.out.println(greeterCasual.greet());
		
	}
}
