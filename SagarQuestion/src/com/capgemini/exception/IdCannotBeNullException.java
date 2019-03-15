package com.capgemini.exception;

public class IdCannotBeNullException extends RuntimeException {

	@Override
	public String toString() {
		return "IdCannotBeNullException";
	}
	
	@Override
	public String getMessage() {
		return "Employee Id cannot be null";
	}
	

}
