package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bean.Address;
import com.capgemini.bean.City;
import com.capgemini.bean.Country;
import com.capgemini.repo.EmployeeRepo;
import com.capgemini.repo.EmployeeRepoImplementation;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.EmployeeServiceImplementation;

public class EmpTesting {

	EmployeeRepo ep;
	EmployeeService es;
	@Before
	public void setUp() throws Exception {
		ep = new EmployeeRepoImplementation();
		es = new EmployeeServiceImplementation(ep);
	}

	@Test(expected = com.capgemini.exception.DuplicateIdException.class)
	public void whenEmployeeIdIsAlreadyUsedForAnyOtherEmployeeThenSystemShouldThrowAnException() {
		City bangalore = new City("Bangalore");
		Country india = new Country("India",bangalore);
		es.createEmployee( "ABC",101, new Address("A-1",india));
	}
	}
