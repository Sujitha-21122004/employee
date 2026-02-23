package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {
  @ExceptionHandler(NameNotFoundException.class)
  public ResponseEntity<Object>NameNotFound(NameNotFoundException ne) {
	  return new ResponseEntity(ne.getMessage(),HttpStatus.NOT_FOUND);
  }
  @ExceptionHandler(IdNotFoundException.class)
  public ResponseEntity<Object>IdNotFound(IdNotFoundException ie){
	  return new ResponseEntity(ie.getMessage(),HttpStatus.NOT_FOUND);
  }
  @ExceptionHandler(AgeNotFoundException.class)
  public ResponseEntity<Object>AgeNotFound(AgeNotFoundException ae){
	  return new ResponseEntity(ae.getMessage(),HttpStatus.NOT_FOUND);
  }
}
