package solution.runner;

import java.util.ArrayList;
import java.util.List;

import solution.devs.BackendDeveloper;
import solution.devs.FrontendDeveloper;
import solution.interfaces.Developer;
import solution.project.Project;

public class Runner {

	public static void main(String[] args) {
		//single dev
		BackendDeveloper backend = new BackendDeveloper();
		FrontendDeveloper frontend = new FrontendDeveloper();
		Project project = new Project();
		
		project.implementOneDev(frontend);
		project.implementOneDev(backend);
		
		System.out.println("\n=======================================================\n");
		
		List<Developer> devs = new ArrayList<>();
		devs.add(frontend);
		devs.add(backend);
		
		//List of developers version 1
		Project multiDevs = new Project(devs);
		multiDevs.implementListOne();
		
		System.out.println("\n=======================================================\n");
		
		//List of developers version 2
		Project devList = new Project();
		devList.implementListTwo(devs);
	}

}
