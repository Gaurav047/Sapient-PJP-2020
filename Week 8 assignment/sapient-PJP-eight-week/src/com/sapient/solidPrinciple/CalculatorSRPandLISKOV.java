package com.sapient.solidPrinciple;
import java.util.Scanner;

public class CalculatorSRPandLISKOV {
	
    int solution; 
    int x; 
    int y; 
    char operator; 

    public CalculatorSRPandLISKOV() 
    { 
        this.solution = 0; 
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Two numbers:");
        this.x = scan.nextInt();
        this.y = scan.nextInt();
        this.operator = scan.next().charAt(0);
        
    } 
    // this purpose function implements LISKOV principle
    // both Scientific Calculators and Normal Calculators are Calculators
    public void Purpose() {
        System.out.println("I am a Calculator");
    }
    // This class has only one function OPERATIONS ON NUMBERS -> whether add, sub, multiply and divide
    // This has only one reason to change -> addition of some other functions like Power, Modulus etc. related to operations
    public void add(int x, int y)  { this.solution = x + y ; }
    public void sub(int x, int y) { this.solution = x - y ; }
    public void multiply(int x, int y) { this.solution = x * y ; }
    public void divide(int x, int y) { this.solution = x / y ; }
    

} 
