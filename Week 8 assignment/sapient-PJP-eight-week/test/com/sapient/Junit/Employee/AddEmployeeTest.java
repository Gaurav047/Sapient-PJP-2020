package com.sapient.Junit.Employee;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddEmployeeTest {
	
	Employee emp = new Employee(); 
	AddEmployee db = new AddEmployee();
	@BeforeEach
	public void setup() {
		
		emp.setId(12);
		emp.setName("Bill Gates");
		emp.setCity("Dharavi");
		db.addEmp(emp);
		emp.setId(13);
		emp.setName("Warren Buffet");
		emp.setCity("Seemapuri");
		db.addEmp(emp);
		emp.setId(14);
		emp.setName("Jeff");
		emp.setCity("Seelampur");
		db.addEmp(emp);
		// here we have database size of 3
	}
	@Test
	void AddEmployeeShouldIncreaseDBSize() {
		emp.setId(15);
		emp.setName("Aditya Atri");
		emp.setCity("New York");
		db.addEmp(emp);
		assertEquals(4, db.list.size());
	}
	@Test
	void addEmpShouldThrowExceptionIfCityOrNameValuesBlank() {
		emp.setId(16);
		emp.setName("");
		emp.setCity("");
		Throwable exception = assertThrows(IllegalArgumentException.class,
		           ()->{db.addEmp(emp);} );
	}
	@Test
	void addEmpShouldThrowExceptionIfCityOrNameValuesNull() {
		emp.setId(16);
		emp.setName(null);
		emp.setCity(null);
		Throwable exception = assertThrows(IllegalArgumentException.class,
		           ()->{db.addEmp(emp);} );
	}
	@Test
	void getEmpShouldReturnValidEmployee() {
		Employee emp = new Employee(); 
		emp.setId(20);
		emp.setName("Pracheta");
		emp.setCity("Jaipur");
		db.addEmp(emp);
		Employee result =  db.getEmp(20);
		assertEquals(emp,result);
	}
	@Test
	void getEmpShouldReturnExceptionIfInvalidEmployeeID() {
		Throwable exception = assertThrows(NoSuchElementException.class,
		           ()->{db.getEmp(123);} );
	}
		
}
