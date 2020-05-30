package com.sapient.questions;

public class MatrixRunner {

	public static void main(String[] args) {
		Matrix matrix1 = new Matrix(4,5);		
		Matrix matrix2 = new Matrix(5,4); 
		matrix1.read();
		matrix2.read(); 
		//addition requires same dimension
		//Matrix addition_matrix = matrix1.addition(matrix2);
		//addition_matrix.display();
		Matrix multiplied_matrix = matrix1.multiply(matrix2);
		multiplied_matrix.display();
	}

}
