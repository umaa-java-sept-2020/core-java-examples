package org.methods.instance;

public class Calculator {
	
	public int sum(int x, int y) // non-static
	{
		int result = x + y;
		return result;
	}
	
	public static int mul(int x, int y) // static method
	{
		int result = x * y;
		return result;
	}

}
