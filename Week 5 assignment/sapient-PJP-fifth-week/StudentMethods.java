package com.sapient.questions;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class StudentMethods {
	
	List<Student> students = new ArrayList<>();
	
	public void read() {
		int id;
		String name;
		String city;
		System.out.println("Enter the id, name, and city of the Student");
		Scanner scan = new Scanner(System.in);
		id = scan.nextInt();
		name = scan.next();
		city = scan.next(); 
		Student student = new Student(id,name,city); 
		students.add(student); 
		// adding this detail to the students list 
		
	}
	
	public Student processById(int id) throws NoSuchElementException {
		for(Student student : students) {
			if(student.getId()==id) {
				return student; 
			}
		}
		throw new NoSuchElementException();
	}
	
	public List<Student> processByCity(String city) {
		List<Student> array = new ArrayList<>();
		for(Student student: students) {
			if(student.getCity() == city) {
				array.add(student);
			}
		}
		return array; 
	}
	
	public List<Student> sortByName() {
		students.sort(new CompareByName());
		return students;
	}
	
	public List<Student> sortByCity() {
		students.sort(new CompareByCity());
		
		return students;
	}
	
	public List<Student> findAll(){
		return students; 
	}
	
}
