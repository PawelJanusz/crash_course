package com.capgemini;

public class Calculator {

	public int add(int a, int b) {
		System.out.println("On the branch master");
		return a + b;
	}

	public double divide(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("cannot divide 0");
		}
		synchronized(this){
			
		}
		return a / b;
	}

}
