package com.sapient.questions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Command_Line1 {
	int n;
	Scanner scanner = new Scanner(System.in);
	List<Integer> arr = new ArrayList<Integer>();
	int sum;
	double avg;
	int min,max; 
	void setData() {
		System.out.println("Enter the value of n:");
		n = scanner.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=0; i<n; i++) {
			arr.add(scanner.nextInt()); 
		}
	}
	void calData() {
		sum=0;
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			sum+=arr.get(i);
			min = Math.min(min,arr.get(i));
			max = Math.max(max,arr.get(i));
		}
		avg = (sum/(n*1.0));	
	}
	void displayData() {
		System.out.printf("Sum: %d",sum).println();
		System.out.printf("Average %.4f",avg).println();
		System.out.printf("Min : %d",min).println();
		System.out.printf("Max : %d",max).println();
	}

}
