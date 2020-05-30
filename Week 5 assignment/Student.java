package com.sapient.questions;

public class Student {

	// private 
	private int id;
	private String name;
	private String city;
	
	// no argument constructor 
	public Student() { }

	public Student(int id, String name, String city) {
		// super is used for the constructor of parent class 
		// if it has no constructor defined then we don't need to pass any argument
		// otherwise we have to 
		super();
		this.setId(id);
		this.setName(name);
		this.setCity(city);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override 
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}