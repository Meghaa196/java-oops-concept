package com.oops;

public class StaticBlockDemo {

	static int a =10;
	
	static
	{
		a=3;
		System.out.println("This is a static block");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("This is the main method");

	}

}
           