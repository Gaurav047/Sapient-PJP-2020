package com.sapient.questions;
import java.util.Comparator;

//if compare function return -1 or 0 then there is no swapping 
//if compare function return 1 then there is swapping 
public class CompareByName implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
