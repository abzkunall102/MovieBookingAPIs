package com.example.MovieTicket.MovieBooking.service;

import java.util.List;

import com.example.MovieTicket.MovieBooking.Model.Movie;

public interface MovieServiceInterface {

	public void createMovie(Movie movie);
	public Movie getMovie(String id);
	public List<Movie> getAllMovie();
}
