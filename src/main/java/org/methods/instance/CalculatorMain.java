package org.methods.instance;

import java.util.Collections;

public class CalculatorMain {
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		//cal = null; // NullPointerException
		int sumResult = cal.sum(10, 20); // non-static resource
		System.out.println(sumResult);
		
		int mulResult = Calculator.mul(20, 2);
		System.out.println(mulResult);
		
		cal = null;
		mulResult = cal.mul(10, 6);
		System.out.println(mulResult);
		
		//Collections.binarySearch(null, null);
	}

}
