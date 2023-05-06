package com.tcs.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import error.NoStudentExistException;

@RestControllerAdvice
public class StudentExceptionHaldler {
	@ExceptionHandler(NoStudentExistException.class)
	public ResponseEntity<String> ex(NoStudentExistException nsee){
		return new ResponseEntity<String>(nsee.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
