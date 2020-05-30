package com.sapient.questions;
import com.sapient.questions.LamdaExpression.Num_Process;

public class Calculator {
	public static Num_Process Addition = (a,b) -> a+b; 
	public static Num_Process Subtract = (a,b) -> a-b;
	public static Num_Process Multiply = (a,b) -> a*b;
	public static Num_Process Division = (a,b) -> a/b; 
	public static int calculate(int a, int b, Num_Process operator) {
        return operator.cal(a, b);
    }
}
