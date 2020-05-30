package com.sapient.questions;

public class convert {
	      static String[] tens = {
		    "",
		    " ten",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"
		  };

		  static String[] ones = {
		    "",
		    " one",
		    " two",
		    " three",
		    " four",
		    " five",
		    " six",
		    " seven",
		    " eight",
		    " nine",
		    " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
		  };
	String convertLessThanThousand(int input) {
		String number="";
		if(input >= 100) {
			number+= ones[input/100]+" hundred";
			input%=100;
		}
		if(input >= 10) {
			number+=tens[input/10];
			input%=10;
		}
		if(input > 0) {
			number+=ones[input];
		}
        return number;
	}
	String fig_to_words(long number) {
		String result;
		String snumber = Long.toString(number);
		int len = snumber.length();
		int rem = 12-len;
		String zeros = "";
		for(int i=0; i<rem; i++) zeros+="0";
		snumber = zeros + snumber;
		//System.out.println(snumber);
		if(number == 0) return "zero";
		//take billions part from the number
		int billions = Integer.parseInt(snumber.substring(0,3));
		String billion_value;
		//System.out.println(billions);
		switch(billions) {
		case 0: billion_value=""; break; 
		case 1: billion_value=convertLessThanThousand(billions)+ " billion"; break; 
		default: billion_value=convertLessThanThousand(billions)+ " billion"; break;
		}
		result=billion_value;
		int millions = Integer.parseInt(snumber.substring(3,6));
		String million_value;
		switch(millions) {
		case 0: million_value=""; break; 
		case 1: million_value=convertLessThanThousand(millions)+ " million"; break; 
		default: million_value=convertLessThanThousand(millions)+ " million"; break;
		}
		result+=million_value;
		int hundredThousands = Integer.parseInt(snumber.substring(6,9));
		String hundredThousands_value;
		switch(hundredThousands) {
		case 0: hundredThousands_value =""; break; 
		case 1: hundredThousands_value ="one thousand"; break; 
		default: hundredThousands_value =convertLessThanThousand(hundredThousands)+ " thousands"; break;
		}
		result+=hundredThousands_value;
		
		int thousands = Integer.parseInt(snumber.substring(9,12));
		String thousands_value;
		thousands_value = convertLessThanThousand(thousands);
		result += thousands_value;
			
		return result;  
		
	}
}
