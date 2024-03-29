package com.capgemini.bean;

public class Address {
	private String addressLine;
	private Country country;
	
	public Address(String addressLine, Country country) {
		super();
		this.addressLine = addressLine;
		this.country = country;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return " " + addressLine + "\n" + country;
	}
	

}
