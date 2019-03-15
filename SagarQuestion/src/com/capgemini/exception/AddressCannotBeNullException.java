package com.capgemini.exception;

public class AddressCannotBeNullException extends RuntimeException {
	
	@Override
	public String toString() {
		return "AddressNullException";
	}

	@Override
	public String getMessage() {
		return "Address cannot be null";
	}

}
