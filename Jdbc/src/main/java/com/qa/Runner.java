package com.qa;

import java.sql.SQLException;

import com.qa.dao.MovieDAO;
import com.qa.domain.Movie;

public class Runner {

	public static void main(String[] args) throws SQLException {

		Movie movieOne = new Movie("Shawshank redemption", "Thriller", 10);
		Movie movieTwo = new Movie("Titanic", "Drama", 9);
		Movie movieThree = new Movie("Harry Potter", "Sci-Fi", 10);
		Movie changedMovie = new Movie("The Hobbit", "Sci-fi", 10);
		MovieDAO dao = new MovieDAO();
		
//		dao.create(movieThree);
//		dao.create(movieTwo);
//		dao.delete(2);
//		dao.update(changedMovie, 1);
		
//		dao.createPrepared(changedMovie);
		
		System.out.println(dao.readAll());
//		System.out.println(dao.readById(3));
	}

}
