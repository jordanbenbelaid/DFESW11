package com.qa;

import java.sql.SQLException;

import com.qa.dao.MovieDAO;
import com.qa.domain.Movie;

public class Runner {

	public static void main(String[] args) throws SQLException {

		Movie movieOne = new Movie("Shawshank redemption", "Thriller", 10);
		Movie movieTwo = new Movie("Titanic", "Drama", 9);
		MovieDAO dao = new MovieDAO();
		
		dao.create(movieOne);
	}

}
