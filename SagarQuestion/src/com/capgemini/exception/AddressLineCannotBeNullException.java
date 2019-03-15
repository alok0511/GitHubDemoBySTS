package com.capgemini.exception;

public class AddressLineCannotBeNullException extends RuntimeException {
	
	@Override
	public String toString() {
		return "AddressLineNullException";
	}

	@Override
	public String getMessage() {
		return "Address line cannot be null";
	}

}
