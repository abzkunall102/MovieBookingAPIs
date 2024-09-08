package com.example.MovieTicket.MovieBooking.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class Movie {

@Size(min=1)
String id;
	@Size(min=3)
	@Size(max=20)
	String movieName;
	@Min(value=1)
	@Max(value=10)
	long movieRating;
	
	
	String movieLanguage;
	List<String> writers=new ArrayList<>();
	List<String> actors=new ArrayList<>();
	List<String> genre=new ArrayList<>();
	String movieDirector;




//public Movie(@Size(min = 1) String id, @Size(min = 3) @Size(max = 20) String movieName,
//			@Min(1) @Max(10) long movieRating, String movieLanguage, List<String> writers, List<String> actors,
//			List<String> genre, String movieDirector) {
//		super();
//		this.id = id;
//		this.movieName = movieName;
//		this.movieRating = movieRating;
//		this.movieLanguage = movieLanguage;
//		this.writers = writers;
//		this.actors = actors;
//		this.genre = genre;
//		this.movieDirector = movieDirector;
//	}
//public Movie(@Size(min = 3) @Size(max = 20) String movieName, String movieDirector, @Min(1) @Max(10) long movieRating,
//		String movieLanguage, List<String> actors, List<String> genre, List<String> writers, @Size(min = 1) String id) {
//	super();
//	this.movieName = movieName;
//	this.movieDirector = movieDirector;
//	this.movieRating = movieRating;
//	this.movieLanguage = movieLanguage;
//	this.actors = actors;
//	this.genre = genre;
//	this.writers = writers;
//	this.id = id;
//}
//public Movie(String movieName, String movieDirector, long movieRating, String movieLanguage, String id) {
//	super();
//	this.id = id;
//	this.movieName = movieName;
//	this.movieDirector = movieDirector;
//	this.movieRating = movieRating;
//	this.movieLanguage = movieLanguage;
//	
//	
//}
public List<String> getWriters() {
	return writers;
}
public void setWriters(List<String> writers) {
	this.writers = writers;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getMovieDirector() {
	return movieDirector;
}
public void setMovieDirector(String movieDirector) {
	this.movieDirector = movieDirector;
}
public long getMovieRating() {
	return movieRating;
}
public void setMovieRating(long movieRating) {
	this.movieRating = movieRating;
}
public String getMovieLanguage() {
	return movieLanguage;
}
public void setMovieLanguage(String movieLanguage) {
	this.movieLanguage = movieLanguage;
}
public List<String> getActors() {
	return actors;
}
public void setActors(List<String> actors) {
	this.actors = actors;
}
public List<String> getGenre() {
	return genre;
}
public void setGenre(List<String> genre) {
	this.genre = genre;
}



}
