package com.qa.ducks.service;

import java.util.List;

public interface ServiceMethods<T> {

	//Create
	T create(T duck);
	
	//Read All
	List<T> readAll();
	
	//Read By Id
	T readById(long id);
	
	//Update
	T update(long id, T duck);
	
	//Delete
	boolean delete(long id);
}
