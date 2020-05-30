package com.sapient.shapes;
import java.util.Scanner;

public class Shapes {

	static int numberOfSides;
	static void calculateShapeArea(int shape, int sideLength) {
		if(shape==1) {
			Circle circle = new Circle();
			double area = circle.calculateArea(sideLength);
			System.out.printf("The Area of the Circle is %.4f", area);
		}
		else if(shape==3) {
			Triangle triangle = new Triangle();
			double area = triangle.calculateArea(sideLength);
			System.out.printf("The Area of the Triangle is %.4f", area);
		}
		else if(shape==4) {
			Square square = new Square();
			double area = square.calculateArea(sideLength);
			System.out.printf("The Area of the Square is %.4f", area);
		}
		else {
			System.out.println("No Shapes Present"); 
		}
			
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int sideLength;
		System.out.println("Enter noOfSide and sideLength");
		numberOfSides = scanner.nextInt();
		sideLength = scanner.nextInt();
		calculateShapeArea(numberOfSides,sideLength);	
	}

}
