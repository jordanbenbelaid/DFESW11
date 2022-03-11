package com.qa.ducks.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class DuckTest {

	// Remember to import the equalsverifier dependency
	@Test
	public void testEquals() {
		EqualsVerifier.forClass(Duck.class).usingGetClass().verify();
	}

	@Test
	public void getAndSetTest() {
		// Create empty duck object
		Duck duck = new Duck();

		// Use the setter methods to add values to each field, so we can check the
		// setters work
		duck.setId(1L);
		duck.setAge(4);
		duck.setGender("Female");
		duck.setHabitat("Lake");
		duck.setName("Ducky");

		// make sure after the setters, they actually set the values and are not null
		assertNotNull(duck.getAge());
		assertNotNull(duck.getId());
		assertNotNull(duck.getGender());
		assertNotNull(duck.getName());
		assertNotNull(duck.getHabitat());

		// make sure that when we use the getters, they get the correct value
		assertEquals(duck.getAge(), 4);
		assertEquals(duck.getId(), 1L);
		assertEquals(duck.getGender(), "Female");
		assertEquals(duck.getName(), "Ducky");
		assertEquals(duck.getHabitat(), "Lake");
	}

	@Test
	public void allArgsConstructor() {
		Duck duck = new Duck(1L, 3, "Jordan", "House pond", "Male");

		// make sure after the setters, they actually set the values and are not null
		assertNotNull(duck.getAge());
		assertNotNull(duck.getId());
		assertNotNull(duck.getGender());
		assertNotNull(duck.getName());
		assertNotNull(duck.getHabitat());

		// make sure that when we use the getters, they get the correct value
		assertEquals(duck.getAge(), 3);
		assertEquals(duck.getId(), 1L);
		assertEquals(duck.getGender(), "Male");
		assertEquals(duck.getName(), "Jordan");
		assertEquals(duck.getHabitat(), "House pond");
	}
}
