package com.example.demo.exception;

public class UserNotFoundException extends RuntimeException{
public UserNotFoundException(Long id) {
	super("Could Not Found the user with id " +id);
}
}
