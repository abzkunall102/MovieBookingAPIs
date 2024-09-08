package com.example.MovieTicket.MovieBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieTicket.MovieBooking.Model.Movie;
import com.example.MovieTicket.MovieBooking.service.MovieService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/ticket")
public class controller {
	
	@Autowired
	MovieService movieService;
	

	
	
	@PostMapping("/movie")
	public void createMovie(@Valid @RequestBody Movie movie,BindingResult bindingResult){
		
		if(bindingResult.hasErrors()) {
			throw new RuntimeException("Request Not Valid");
		}
		movieService.createMovie(movie);
		
		
	}
	@GetMapping("/movie/{id}")
	public Movie getMovieById(@PathVariable String id){
		return movieService.getMovie(id);
	}
	@GetMapping("/movies")
	public List<Movie> getAllMovie() {
		return movieService.getAllMovie();
	}
	
	@DeleteMapping("/movie/{id}")
	public void deleteMoviebyId(@PathVariable String id){
		movieService.deleleMovieById(id);
	}
	@PutMapping("/update/{id}")
	public void updateMovie(@Valid @RequestBody Movie movie ,@PathVariable String id,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			throw new RuntimeException("Request Not Valid");
		}
		movieService.updateMovie(movie,id);
		
		
	}
}

