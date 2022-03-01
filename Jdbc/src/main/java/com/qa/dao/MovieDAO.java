package com.qa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.qa.config.DatabaseConfig;
import com.qa.domain.Movie;

//DAO ----> Data Access Object 
public class MovieDAO {

	private Statement statement;
	private Connection connection;
	
	public MovieDAO() throws SQLException {
		this.connection = DriverManager.getConnection(DatabaseConfig.url, DatabaseConfig.username, 
				DatabaseConfig.password);
		this.statement = connection.createStatement();
	}
	
	//ResultSet    ----  Allows us to get back information that java can read from the MySql table
	public Movie movieFromResultSet(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt("id");
		String name = resultSet.getString("name");
		String genre = resultSet.getString("genre");
		int rating = resultSet.getInt("rating");
		
		return new Movie(id, name, genre, rating);
	}
	
	//ReadAll statement
	public List<Movie> readAll(){
		try {
			ResultSet resultSet = statement.executeQuery("SELECT * FROM movie"); 
			List<Movie> movies = new ArrayList<>();
			while(resultSet.next()) {
				movies.add(movieFromResultSet(resultSet));
			}
			return movies;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	//Create statement
	public void create(Movie movie) {
		try {
			statement.executeUpdate("INSERT INTO movie(`name`, `genre`, `rating`) "
					+ "VALUES ('"+ movie.getName() +"', '"+ movie.getGenre() + "', "+ movie.getRating()+")");
			
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	//Update statement
	public void update(Movie movie, int id) {
		try {
			statement.executeUpdate("UPDATE movie SET `name` = '" + movie.getName() + "', `genre` = '" + movie.getGenre() + 
					"', `rating` = " + movie.getRating() + " WHERE id = " + id);
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Delete statement 
	public void delete(int id) {
		try {
			statement.executeUpdate("DELETE FROM movie WHERE id = " + id);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
