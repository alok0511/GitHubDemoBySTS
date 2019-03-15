package com.capgemini.exception;

public class NegativeEmployeeIdException extends RuntimeException {
	
	@Override
	public String toString() {
		return "NegativeEmployeeIdException";
	}

	@Override
	public String getMessage() {
		return "Employee id cannot be negative";
	}

}
