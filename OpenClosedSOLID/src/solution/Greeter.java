package solution;

public class Greeter {

	private Greeting greeting;
	
	public Greeter(Greeting greeting) {
		this.greeting = greeting;
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public String greet() {
		return this.greeting.greet();
	}
	
}
