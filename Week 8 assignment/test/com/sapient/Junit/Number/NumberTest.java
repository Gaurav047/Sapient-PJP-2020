package com.sapient.Junit.Number;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberTest {

	private NumberMethods number; 
	@BeforeEach
	public void setup(){
		number = new Number();
	}
	@Test
	void checkPrimeShouldReturnValidOutput() {
		int result = number.checkPrime(37); 
		assertNotNull(result);
		assertEquals(1,result); 
	}
	@Test
	void checkPrimeShouldReturnExceptionForNumberLessThanZero() {
		Throwable exception = assertThrows(IllegalArgumentException.class,
	           ()->{number.checkPrime(-23);} );
	}
	@Test
	void checkAmstrongShouldReturnValidOutput() {
		Boolean result = number.checkAmstrong(153); 
		assertNotNull(result);
		assertEquals(true,result); 
	}
	@Test
	void checkAmstrongShouldReturnExceptionForNumberLessThanZero() {
		Throwable exception = assertThrows(IllegalArgumentException.class,
	           ()->{number.checkAmstrong(-23);} );
	}
	@Test
	void checkPalindromeShouldReturnValidOutput() {
		Boolean result = number.checkPalindrome(123321); 
		assertNotNull(result);
		assertEquals(true,result); 
	}
	@Test
	void checkPalindromeShouldReturnExceptionForNumberLessThanZero() {
		Throwable exception = assertThrows(IllegalArgumentException.class,
	           ()->{number.checkPalindrome(-23);} );
	}
	@AfterEach
	public void teardown(){
		number = null;
	}
	
}

