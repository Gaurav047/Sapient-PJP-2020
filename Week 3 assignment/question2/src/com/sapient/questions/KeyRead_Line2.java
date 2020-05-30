package com.sapient.questions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KeyRead_Line2 {
	int n;
	Scanner scanner = new Scanner(System.in);
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	void Read() {
		System.out.println("Enter the value of n:");
		n = scanner.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=0; i<n; i++) {
			arr.add(scanner.nextInt()); 
		}
	}
	void Display() {
		System.out.println("Display the numbers:");
		for(int i=0; i<n; i++) {
			System.out.printf("%d ",arr.get(i));
		}
		System.out.println();
	}
	void sort() {
		Collections.sort(arr);
	}
	void find() {
		System.out.println("Enter the number to be find");
		int num = scanner.nextInt();
		boolean found = arr.contains(num);
		if(found == true) System.out.println("Found");
		else System.out.println("Not Found");
	}
}
