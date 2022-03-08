package com.qa.ducks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.ducks.entity.Duck;
import com.qa.ducks.repo.DuckRepo;

@Service
public class DuckService implements ServiceMethods<Duck>{
	//NOT making a new object, creating a variable of the type DuckRepo
	private DuckRepo repo;
	
	//Above is different to this, as we are trying to instantiate an object below (Cannot instantiate an interface)
	//DuckRepo repo = new DuckRepo();
	
	//Constructor
	public DuckService(DuckRepo repo) {
		this.repo = repo;
	}

	@Override
	public Duck create(Duck duck) {
		return this.repo.save(duck);
	}

	@Override
	public List<Duck> readAll() {
		return this.repo.findAll();
	}

	@Override
	public Duck readById(long id) {
		Optional<Duck> getDuck = this.repo.findById(id);
		if(getDuck.isPresent()) {
			return getDuck.get();
		}
		return null;
	}

	//When setting values, DO NOT set the id
	@Override
	public Duck update(long id, Duck duck) {
		Optional<Duck> existingDuck = this.repo.findById(id);
		if(existingDuck.isPresent()) {
			Duck exists = existingDuck.get();
			exists.setAge(duck.getAge());
			exists.setGender(duck.getGender());
			exists.setHabitat(duck.getHabitat());
			exists.setName(duck.getName());
			
			return this.repo.saveAndFlush(exists);
		}
		return null;
	}

	//Deletes the id, and checks to see if it it still exists (should return true if it has worked)
	@Override
	public boolean delete(long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
