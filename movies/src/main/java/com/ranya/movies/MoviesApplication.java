package com.ranya.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ranya.movies.service.MovieService;

@SpringBootApplication
public class MoviesApplication implements CommandLineRunner {
	@Autowired
	MovieService movieService;

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		movieService.saveMovie(new Movie("the walking dead", 2600.0, new Date()));
		movieService.saveMovie(new Movie("intersteller", 2800.0, new Date()));
		movieService.saveMovie(new Movie("allied", 900.0, new Date()));
		
	}

}
