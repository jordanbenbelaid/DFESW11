package generic;

import java.util.List;

public interface CatStuff<F>{

	//CRUD FUNCTIONS
	
	//Create
		F create(F t);
		
		//Read All
		List<F> getAll();
		
		//Read By Id
		F getById(long id);
		
		//Update
		F update(long id, F t);
		
		//Delete
		boolean delete(long id);
}
