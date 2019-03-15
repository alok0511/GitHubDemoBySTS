package com.capgemini.exception;

public class NameNotFoundException extends RuntimeException {
	
	@Override
	public String toString() {
		return "NameNotFoundException";
	}

	@Override
	public String getMessage() {
		return "Name is not present in database";
	}
	
	

}
