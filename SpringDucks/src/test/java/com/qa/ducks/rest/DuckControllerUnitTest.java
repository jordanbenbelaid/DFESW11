package com.qa.ducks.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.qa.ducks.controller.DuckController;
import com.qa.ducks.entity.Duck;
import com.qa.ducks.service.DuckService;

@SpringBootTest
public class DuckControllerUnitTest {

	@Autowired
	private DuckController controller;
	
	@MockBean
	private DuckService service;
	
	@Test
	public void createDuckTest() {
		Duck duck = new Duck(12, "Donald", "Disneyworld", "Male");
		
		Mockito.when(this.service.create(duck)).thenReturn(duck);
		
		ResponseEntity<Duck> response = new ResponseEntity<Duck>(duck, HttpStatus.CREATED);
		
		assertThat(response).isEqualTo(this.controller.createDuck(duck));
		
		Mockito.verify(this.service, times(1)).create(duck);
	}
}
