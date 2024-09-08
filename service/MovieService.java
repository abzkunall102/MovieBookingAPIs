package com.example.MovieTicket.MovieBooking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.MovieTicket.MovieBooking.Exceptions.ExistingMovieException;
import com.example.MovieTicket.MovieBooking.Exceptions.MovieNotFoundException;
import com.example.MovieTicket.MovieBooking.Model.Movie;

@Service
public class MovieService implements MovieServiceInterface {
	
	List<Movie> movies= new ArrayList<>();
	Map<String,Movie> hashMapMovie=new HashMap<>();

	@Override
	public void createMovie(Movie movie) {
		
		if(!ObjectUtils.isEmpty(hashMapMovie.get(movie.getId()))) {
			throw new ExistingMovieException("Movie with id is there");
		}
		//if(OjectUtils.)
		movies.add(movie);
		hashMapMovie.put(movie.getId(), movie);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Movie getMovie(String id) {
		// TODO Auto-generated method stub
		if(ObjectUtils.isEmpty(hashMapMovie.get(id))) {
			throw new MovieNotFoundException("Movie with id" + id +"not there");
		}
		Movie movie= hashMapMovie.get(id);
		return movie;
		
	}

	@Override
	public List<Movie> getAllMovie() {
		// TODO Auto-generated method stub
		return movies;
	}

	public void deleleMovieById(String id) {
		// TODO Auto-generated method stub
		if(ObjectUtils.isEmpty(hashMapMovie.get(id))) {
			throw new MovieNotFoundException("Movie with id" + id +"not there");
		}
		Movie movie =getMovie(id);
		movies.remove(movie);
		hashMapMovie.remove(id);
		
	}
//	public void updateMovie(Movie movie,String id) {
//		Movie oldMovie =getMovie(id);
//		movies.remove(oldMovie);
//		movies.add(movie);
//		hashMapMovie.put(id,movie);
//		
//	}

	public void updateMovie(Movie movie, String id) {
		// TODO Auto-generated method stub
		Movie oldMovie =getMovie(id);
	movies.remove(oldMovie);
    movies.add(movie);
		hashMapMovie.put(id,movie);
	
		
	}

}
