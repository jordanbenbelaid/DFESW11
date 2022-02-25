package solution.devs;

import solution.interfaces.Developer;

public class FrontendDeveloper implements Developer{

	@Override
	public void develop() {
		writeJavaScript();		
	}
	
	public void writeJavaScript() {
		System.out.println("Javascript is okay");
	}

}
