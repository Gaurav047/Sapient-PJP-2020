package com.sapient.questions;
import java.util.Scanner;

public class LamdaExpression {
	 
	public interface Num_Process {
		//abstract method
		int cal(int a, int b); 
	}
	
	public static void main(String args[]) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException{
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter two numbers:");
	    int a = scanner.nextInt();
	    int b = scanner.nextInt();
	    System.out.println("Enter the choice: 1: Addition 2: Subtract 3: Multiply 4: Division");
	    String s = scanner.next();
	    
	    Calculator calculator = new Calculator(); 
	    Num_Process operator = (Num_Process)Calculator.class.getField(s).get(calculator);
	    int result = Calculator.calculate(a,b, operator);
        System.out.println(result);
	
	}  
}        