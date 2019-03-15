package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Address;
import com.capgemini.bean.Employee;
import com.capgemini.exception.AddressCannotBeNullException;
import com.capgemini.exception.AddressLineCannotBeNullException;
import com.capgemini.exception.DuplicateIdException;
import com.capgemini.exception.InvalidEmployeeIdException;
import com.capgemini.exception.NameCannotBeNullException;
import com.capgemini.exception.NameNotFoundException;
import com.capgemini.exception.NegativeEmployeeIdException;
import com.capgemini.repo.EmployeeRepo;

public class EmployeeServiceImplementation implements EmployeeService {
	private EmployeeRepo ep;
	

	public EmployeeServiceImplementation(EmployeeRepo ep) {
		super();
		this.ep = ep;
	}

	@Override
	public Employee createEmployee(String name,int id, Address address)   {
		Employee e = ep.findById(id);
		if(e!=null){
			throw new DuplicateIdException();
		}
		else if(id<0) {
			throw new NegativeEmployeeIdException();
		}
		else if(name==null||name.equals("")) {
			throw new NameCannotBeNullException();
		}
		else if(address==null) {
			throw new AddressCannotBeNullException();
		}
		else if(address.getAddressLine()==null||address.getAddressLine().equals("")) {
			throw new AddressLineCannotBeNullException();
		}
		else{
			
		Employee emp = new Employee();
		emp.setName(name);
		emp.setId(id);
		emp.setAddress(address);
		
		return ep.save(emp);
		}
	}
		

	@Override
	public List<Employee> searchByName(String name) {
		if(name==null||name.equals("")) {
			throw new NameCannotBeNullException();
		}
		List<Employee> list = ep.findByName(name);
		if(list==null||list.isEmpty()) {
			throw new NameNotFoundException();
		}
		return list;
	}
	
	@Override
	public Employee searchById(int id) {
		if(id<0) {
			throw new NegativeEmployeeIdException();
		}
		Employee emp = ep.findById(id);
		if(emp==null) {
			throw new InvalidEmployeeIdException();
		}
		return emp;
	}
	
}
