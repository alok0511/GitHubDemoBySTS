package com.capgemini.exception;

public class DuplicateIdException extends RuntimeException {

	@Override
	public String toString() {
		return "DuplicateIdException";
	}
	
	@Override
	public String getMessage() {
		return "Duplicate id found";
	}
	
	

}
