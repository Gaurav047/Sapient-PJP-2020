package com.sapient.Junit.Number;

public class Number implements NumberMethods {

	@Override
	public int checkPrime(int x) {
		
		if(x < 0) {
			throw new IllegalArgumentException();
		}
		for(int i=2; i<=Math.sqrt(x); i++) {
			if(x%i==0) return 0; 
		}
		return 1;
	}

	@Override
	public Boolean checkAmstrong(int x) {
		if(x < 0) {
			throw new IllegalArgumentException();
		}
		String strNum = Integer.toString(x);
		int ndigits = strNum.length(); 
		int orig_x = x; 
		int result = 0; 
		while(x!=0) {
			int digit = x%10; 
			x=x/10;
			result+= Math.pow(digit, ndigits);
		}
		if(result==orig_x) return true;
		else return false; 
	}

	@Override
	public Boolean checkPalindrome(int x) {
		if(x < 0) {
			throw new IllegalArgumentException();
		}
		String strNum = Integer.toString(x);
		int len = strNum.length();
		for(int i=0; i <= len/2 - 1; i++) {
			if(strNum.charAt(i)!=strNum.charAt(len-i-1))
				return false; 
		}
		return true; 
	}

}
