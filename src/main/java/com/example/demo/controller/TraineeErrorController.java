package com.example.demo.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.ErrorResponse;
import com.example.demo.exception.DuplicateTraineeException;
import com.example.demo.exception.TraineeNotFoundException;

@RestControllerAdvice
public class TraineeErrorController {

	@ExceptionHandler(DuplicateTraineeException.class)
	@ResponseStatus(code=HttpStatus.NOT_ACCEPTABLE)
	public ErrorResponse handleDuplicateEmployeeException(DuplicateTraineeException ex, HttpServletRequest request) {
		
		return new ErrorResponse(LocalDateTime.now(), 
									HttpStatus.NOT_ACCEPTABLE.value(), 
									ex.getClass().getSimpleName(), 
									ex.getMessage(), 
									request.getRequestURI()
									);
}
	
	
	
	@ExceptionHandler(TraineeNotFoundException.class)
	@ResponseStatus(code=HttpStatus.NOT_ACCEPTABLE)
	public ErrorResponse handleTraineeNotFoundException(DuplicateTraineeException ex, HttpServletRequest request) {
		
		return new ErrorResponse(LocalDateTime.now(), 
									HttpStatus.NOT_ACCEPTABLE.value(), 
									ex.getClass().getSimpleName(), 
									ex.getMessage(), 
									request.getRequestURI()
									);
}
	
}