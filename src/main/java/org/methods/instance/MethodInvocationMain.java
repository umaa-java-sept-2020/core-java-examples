package org.methods.instance;

public class MethodInvocationMain {
	
	static{
		
		System.out.println("static block");
		m2();
		MethodInvocationMain m = new MethodInvocationMain();// this will execute non-static block
		m.m1();
		System.out.println("static block end");
	}
	
	{
		System.out.println("non-static block");
		m1();
		m2();
		System.out.println("non-static block end");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		m2();
		MethodInvocationMain t = new MethodInvocationMain();// non-static block execution
		t.m1();
		System.out.println("main method end");
	}
	
	void m1()
	{
		System.out.println("non-static method m1()");
	}
	
	static void m2()
	{
		System.out.println("static method m2()");
	}

}
