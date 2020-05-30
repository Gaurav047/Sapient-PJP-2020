package com.sapient.questions;

public class Int_Arr_Process_execute {

	public static void main(String[] args) {
		
		 Int_Arr_Process input = new Int_Arr_Process(5);
		 input.read();
		 input.display();
		 input.largestSmallest();
		 input.secondBiggest();
		 Int_Arr_Process copy_input = new Int_Arr_Process(input);
		 //now display the elements of copy constructor 
		 copy_input.display();
         
	}

}
