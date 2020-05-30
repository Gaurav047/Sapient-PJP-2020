package com.sapient.questions;
import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process {
	private int arr[];
	public Int_Arr_Process(){
		arr = new int[10];
	}
	public Int_Arr_Process(int size) {
		arr = new int[size];
	}
	public Int_Arr_Process(Int_Arr_Process a) {
		
		this.arr = new int[a.arr.length];
		for(int i=0; i< arr.length; i++) this.arr[i] = a.arr[i]; 
	}
	public void read() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(int i=0; i<arr.length; i++) {
			int data = scanner.nextInt();
			this.arr[i] = data; 
		}
	}
	public void display() {
		// horizontal one
		System.out.println("Horizontal Print:");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ",this.arr[i]);
		}
		System.out.println();
		// vertical one
		System.out.println("Vertical Print:");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public void sort() {
		Arrays.sort(arr);
	}
	public void largestSmallest() {
		int min_elem = Integer.MAX_VALUE;
		int max_elem = Integer.MIN_VALUE;
		for(int i=0;i<arr.length; i++) {
			min_elem = Math.min(min_elem, arr[i]);
			max_elem = Math.max(max_elem,arr[i]);
		}
		System.out.println("Largest: "+max_elem+ " Smallest: "+min_elem); 
	}
	public void sum() {
		int sum=0;
		for(int i=0; i< arr.length; i++) {
			sum+= arr[i]; 
		}
		System.out.println("Summation: "+sum); 
	}
	public void secondBiggest() {
		int max1_elem = Integer.MIN_VALUE;
		int max2_elem = Integer.MIN_VALUE;
		for(int i=0;i<arr.length; i++) {
			if(max1_elem < arr[i]) {
				max2_elem = max1_elem;
				max1_elem = arr[i]; 
			}
			else if(arr[i] > max2_elem && max1_elem > arr[i]) max2_elem = arr[i]; 
		}
		System.out.println("Second Largest: "+max2_elem); 
	}
	
}
