package com.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	//handle specific exceptions
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception ex,WebRequest request)
	{
		ErrorClass er=new ErrorClass(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(er,HttpStatus.NOT_FOUND);
	}
	
	//handle global exceptions
}
