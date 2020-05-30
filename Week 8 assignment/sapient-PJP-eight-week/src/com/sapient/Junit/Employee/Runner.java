package com.sapient.Junit.Employee;

public class Runner {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emp1.setId(1);
		emp1.setName("Aditya Atri");
		emp1.setCity("Banglore"); 
		emp2.setId(2);
		emp2.setName("Pracheta");
		emp2.setCity("Jaipur"); 
		emp3.setId(3);
		emp3.setName("John");
		emp3.setCity("Las Vegas"); 
		
		AddEmployee database = new AddEmployee();
		database.addEmp(emp1);
		database.addEmp(emp2);
		database.addEmp(emp3);
		Employee result = database.getEmp(1); 
		System.out.println(result.toString()); 
	}

}
