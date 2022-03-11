package com.qa.ducks.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.ducks.entity.Duck;
import com.qa.ducks.repo.DuckRepo;

@SpringBootTest
public class DuckServiceUnitTest {

	// tells Spring to insert this object into the class
	@Autowired
	private DuckService service;

	// mocking the repository class as we dont want to rely on the class itself
	@MockBean
	private DuckRepo repo;

	@Test
	public void createDuckTest() {
		Duck input = new Duck(3, "Jordan", "House pond", "Male");
		Duck output = new Duck(1L, 3, "Jordan", "House pond", "Male");

		// Here we are testing the actual method (within the create method in the
		// DuckService class)
		Mockito.when(this.repo.save(input)).thenReturn(output);

		// Here we are checking the expected value (output) is the same as the actual
		// value that gets output when we run the create method in service
		assertEquals(output, this.service.create(input));
		
		//Verifies that the repo is run 1 time, and saves the input
		Mockito.verify(this.repo, Mockito.times(1)).save(input);
	}
	
	@Test
	public void readByIdTest() {
		//Here we are using an optional because we use it in the readById() method in the DuckService class
		Optional<Duck> optionalOutput = Optional.of(new Duck(1L, 3, "Jordan", "House pond", "Male"));
		Duck output = new Duck(1L, 3, "Jordan", "House pond", "Male");
		
		//Mockito.anyLong() checks that the type of data that we use is a Long, no matter what the number
		Mockito.when(this.repo.findById(Mockito.anyLong())).thenReturn(optionalOutput);
		
		assertEquals(output, this.service.readById(Mockito.anyLong()));
		
		Mockito.verify(this.repo, Mockito.times(1)).findById(Mockito.anyLong());
	}
	
	
	
	
	
	
}
