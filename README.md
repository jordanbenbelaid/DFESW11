# SQL for JDBC

CREATE SCHEMA movies;

USE movies;

CREATE TABLE movie(
`id` INT PRIMARY KEY auto_increment,
`name` varchar(50) UNIQUE NOT NULL,
`genre` varchar(50) NOT NULL,
`rating` INT NOT NULL
);

INSERT INTO movie(`name`, `genre`, `rating`) VALUES ('The Matrix', 'Thriller', 5);
UPDATE movie SET name='hello', genre = 'good', rating=2;
