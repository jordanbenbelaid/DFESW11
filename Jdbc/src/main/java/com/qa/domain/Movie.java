package com.qa.domain;

public class Movie {

	//Attributes
	private int id;
	private String name;
	private String genre;
	private int rating;
	
	//default constructor
	public Movie() {}
	
	//All arguments constructor
	public Movie(int id, String name, String genre, int rating) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.rating = rating;
	}
	
	//Everything EXCEPT id
	public Movie(String name, String genre, int rating) {
		this.name = name;
		this.genre = genre;
		this.rating = rating;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "\nMovie: \nid: " + id + "\nname: " + name + "\ngenre: " + genre + "\nrating: " + rating + "\n";
	}
	
	
	
}
