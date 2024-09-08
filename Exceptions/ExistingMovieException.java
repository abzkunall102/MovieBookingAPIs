package com.example.MovieTicket.MovieBooking.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExistingMovieException extends RuntimeException{

	public ExistingMovieException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
