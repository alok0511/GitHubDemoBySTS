package com.capgemini.exception;

public class NameCannotBeNullException extends RuntimeException {
	public String getMessage(){
		return "Name Cannot be Null";
	}

	@Override
	public String toString() {
		return "NameCannotBeNullException";
	}
	

}
