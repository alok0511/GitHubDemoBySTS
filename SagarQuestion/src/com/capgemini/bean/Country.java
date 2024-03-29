package com.capgemini.bean;

public class Country {
	private String countryName;
	private City city;
	
	public Country(String countryName, City city) {
		super();
		this.countryName = countryName;
		this.city = city;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Country=" + countryName + "\n" + city;
	}
	

}
