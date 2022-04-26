package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {

	@Test
	public void testAdd() {
		// given
		int a = 5;
		int b = 9;

		// when
		int result = new Calculator().add(a, b);

		// then
		assertEquals(14, result);
	}

	@Test
	public void testDivide() throws Exception {
		// given
		int a = 8;
		int b = 4;

		// when
		double result = new Calculator().divide(a, b);

		// then
		assertEquals(2.0, result, 0.0);
	}

	@Test
	public void shouldThrowsException(){
		//given
		//when
		Calculator calculator = new Calculator();
		double actual = 0;
		//then
		assertThrows(IllegalArgumentException.class, () -> calculator.divide(8, actual));
	}
	
}
