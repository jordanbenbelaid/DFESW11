package com.qa.ducks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.ducks.entity.Duck;
import com.qa.ducks.service.DuckService;

@RestController
@RequestMapping("/duck")
public class DuckController {

	private DuckService service;

	@Autowired // instructs Spring to insert the DuckService object
	public DuckController(DuckService service) {
		this.service = service;
	}

	// Create
	@PostMapping("/create")
	// @RequestBody allows us to pass through an object/data when we make the
	// request
	public ResponseEntity<Duck> createDuck(@RequestBody Duck duck) {
		return new ResponseEntity<Duck>(this.service.create(duck), HttpStatus.CREATED);
	}

	// Read All
	@GetMapping("/readAll")
	public ResponseEntity<List<Duck>> readAllDucks() {
		// We return a list because the readAll method in the service class returns a
		// list also
		return new ResponseEntity<List<Duck>>(this.service.readAll(), HttpStatus.OK);
	}

	// Read By Id
	@GetMapping("/readById/{id}")
	// @PathVariable allows us to pass a variable (in this case ID) to the path &
	// service.readById method
	public ResponseEntity<Duck> readById(@PathVariable long id) {
		return new ResponseEntity<Duck>(this.service.readById(id), HttpStatus.OK);
	}

	// Update
	@PutMapping("/update/{id}")
	// update requires both RequestBody and PathVariable as it takes in the id, and
	// also passes through the new object information
	public ResponseEntity<Duck> updateDuck(@PathVariable long id, @RequestBody Duck duck) {
		return new ResponseEntity<Duck>(this.service.update(id, duck), HttpStatus.ACCEPTED);
	}

	// Delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteDuck(@PathVariable long id) {
		// Ternary operator, IF service.delete goes through (deletes the id), return no
		// content, ELSE return not found
		return (this.service.delete(id)) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	/*
	 * This is the same as above, but written using if/else statements
	 * if(this.service.delete(id) == true) { new
	 * ResponseEntity<Boolean>(HttpStatus.NO_CONTENT) } else { new
	 * ResponseEntity<Boolean>(HttpStatus.NOT_FOUND) }
	 */
}
