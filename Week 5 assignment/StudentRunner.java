package com.sapient.questions;
import java.util.List;
import java.util.Scanner; 

public class StudentRunner {
	
	public static void main(String[] args) {
		
		StudentMethods database = new StudentMethods();
		Scanner scan = new Scanner(System.in); 
		int input; 
		while(true) {
			database.read();
			System.out.println("To contine press 1 else 0"); 
			input = scan.nextInt();
			if(input == 0 ) break; 
		}
		
		//print all the students's database 
		for(Student student : database.findAll()) {
			System.out.println(student.toString()); 
		}
		
		//search by Id
		System.out.println("Enter the id to be searched");
		int id = scan.nextInt();
		Student result = database.processById(id);
		System.out.println(result.toString()); 
		
		//search by City 
		System.out.println("Enter the city to be searched");
		String city = scan.next();
		List<Student> result_array = database.processByCity(city);
		for(Student student : result_array) {
			System.out.println(student.toString()); 
		}
		
		//sort the database by Name 
		for(Student student : database.sortByName()) {
			System.out.println(student.toString()); 
		}
		
		//sort the database by City
		for(Student student : database.sortByCity()) {
			System.out.println(student.toString()); 
		}
		
	}
}
