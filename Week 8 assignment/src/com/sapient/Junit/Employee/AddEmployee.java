package com.sapient.Junit.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class AddEmployee {
	
	List<Employee> list = new ArrayList(); 
	
	public void addEmp(Employee emp) {
		if(emp.getCity() == "" || emp.getName() == "" || emp.getCity() == null || emp.getName() == null)
			throw new IllegalArgumentException();
		list.add(emp);
	}
	
	public Employee getEmp(int id) throws NoSuchElementException {
		
		for(Employee emp : list) {
			if(emp.getId() == id) return emp; 
		}
		throw new NoSuchElementException();
	}
}
