package com.sapient.questions;

import java.util.Scanner;

public class Matrix {
	private int matrix[][];
	private int n,m;
	public Matrix() {
		matrix = new int[3][3];
		this.n=3;
		this.m=3;
	}
	public Matrix(int n, int m) {
		matrix = new int[n][m];
		this.n = n;
		this.m = m; 
	}
	public Matrix(Matrix new_matrix) {
		this.n = new_matrix.matrix.length;
		this.m = new_matrix.matrix[0].length;
		this.matrix = new int[n][m];
		for(int i=0; i< this.n; i++) {
			for(int j=0; j< this.m; j++) {
				this.matrix[i][j] = new_matrix.matrix[i][j]; 
			}
		}
	}
	public void read() {
		Scanner scanner = new Scanner(System.in); 
		for(int i=0; i<this.n; i++) {
			for(int j=0; j<this.m; j++) {
				int data = scanner.nextInt();
				matrix[i][j]=data;
			}
		}
	}
	public void display() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public Matrix addition(Matrix matrix1) {
		Matrix new_matrix = new Matrix(n,m);
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				new_matrix.matrix[i][j] = this.matrix[i][j] + matrix1.matrix[i][j];
			}
		}
		return new_matrix; 
	}
	public boolean isScalar() {
		if(n!=m) return false;
		int value = matrix[0][0]; 
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) { 
				if(i!=j && matrix[i][j]!=0) return false; 
				if(i==j && value != matrix[i][j]) return false; 
			}
		}
		return true; 
	}
	public Matrix multiply(Matrix matrix1) {
		int dim1 = this.n; 
		int dim2 = matrix1.matrix[0].length; 
		Matrix new_matrix = new Matrix(dim1,dim2);
		for(int i=0; i<dim1; i++) {
			for(int j=0; j<dim2; j++) {
				int data = 0; 
				for(int k=0; k<m; k++) {
					data+= this.matrix[i][k]* matrix1.matrix[k][j];
				}
				new_matrix.matrix[i][j]=data; 
			}
		}
		return new_matrix; 
	}
}
