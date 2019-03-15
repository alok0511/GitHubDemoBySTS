package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Address;
import com.capgemini.bean.Employee;
import com.capgemini.exception.NameCannotBeNullException;

public interface EmployeeService {
	public Employee createEmployee(String name,int id, Address address)throws NameCannotBeNullException;
	public List<Employee> searchByName(String name);
	public Employee searchById(int id);

}
