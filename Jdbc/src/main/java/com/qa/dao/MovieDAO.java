package com.qa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

	// ResultSet ---- Allows us to get back information that java can read from the
	// MySql table
	public Movie movieFromResultSet(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt("id");
		String name = resultSet.getString("name");
		String genre = resultSet.getString("genre");
		int rating = resultSet.getInt("rating");

		return new Movie(id, name, genre, rating);
	}

	// ReadAll statement
	public List<Movie> readAll() {
		try {
			ResultSet resultSet = statement.executeQuery("SELECT * FROM movie");
			List<Movie> movies = new ArrayList<>();
			while (resultSet.next()) {
				movies.add(movieFromResultSet(resultSet));
			}
			return movies;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// ReadById statement
	public Movie readById(int id) {
		try {
			ResultSet resultSet = statement.executeQuery("SELECT * FROM movie WHERE id = " + id);
			resultSet.next();
			return movieFromResultSet(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// ReadById prepared statement
	public Movie readByIdPrepared(int id) {
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM movie WHERE id = ?");
			statement.setInt(1, id);

			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			return movieFromResultSet(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// ReadLatest statement
	public Movie readLatest() {
		try {
			ResultSet resultSet = statement.executeQuery("SELECT * FROM movie ORDER BY id DESC LIMIT 1");
			resultSet.next();
			return movieFromResultSet(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Create statement
	public void create(Movie movie) {
		try {
			statement.executeUpdate("INSERT INTO movie(`name`, `genre`, `rating`) " + "VALUES ('" + movie.getName()
					+ "', '" + movie.getGenre() + "', " + movie.getRating() + ")");
			System.out.println(readLatest());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Create prepared statement
	public void createPrepared(Movie movie) {
		try {
			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO movie(`name`, `genre`, `rating`) VALUES (?,?,?)");

			statement.setString(1, movie.getName());
			statement.setString(2, movie.getGenre());
			statement.setInt(3, movie.getRating());
			statement.executeUpdate();

			System.out.println(readLatest());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Update statement
	public void update(Movie movie, int id) {
		try {
			statement.executeUpdate("UPDATE movie SET `name` = '" + movie.getName() + "', `genre` = '"
					+ movie.getGenre() + "', `rating` = " + movie.getRating() + " WHERE id = " + id);
			System.out.println(readById(id));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// Update prepared statement
	public void updatePrepared(Movie movie, int id) {
		try {
			PreparedStatement statement = connection
					.prepareStatement("UPDATE movie set name = ?, genre = ?, rating = ? WHERE id = ?");
			statement.setString(1, movie.getName());
			statement.setString(2, movie.getGenre());
			statement.setInt(3, movie.getRating());
			statement.setInt(4, id);
			statement.executeUpdate();
			
			System.out.println(readById(id));
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	// Delete statement
	public void delete(int id) {
		try {
			statement.executeUpdate("DELETE FROM movie WHERE id = " + id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// Delete prepared statement
	public void deletePrepared(int id) {
		try {
			PreparedStatement statement = connection.prepareStatement("DELETE FROM movie WHERE id = ?");
			
			statement.setInt(1, id);
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
