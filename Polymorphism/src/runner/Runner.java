package runner;

import demo.Bank;
import demo.Barclays;
import demo.Santander;

public class Runner {

	public static void main(String[] args) {
		Barclays barclays = new Barclays();
		barclays.accountOpen();
		barclays.showBalance();
		
		Bank bank = new Barclays();
		bank.accountOpen();
		((Barclays)bank).showBalance();
		
		
		Object object = new Barclays();
		((Barclays)object).accountOpen();
		((Barclays)object).showBalance();

		
		//Goes with the static method at the bottom, can input a bank object or a child of bank object
		Barclays b = new Barclays();
		Santander s = new Santander();
		Bank banking = new Bank();
		
		doBanking(b);
		doBanking(s);
		doBanking(banking);
	}
	
	public static void doBanking(Bank ref) {
		ref.accountOpen();
		ref.showBalance();
	}

}
