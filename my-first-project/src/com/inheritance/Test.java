package com.interitance;
class A
{
	protected int a=20;
	void testA()
	{
		System.out.println("This is a method of class A ");
	}
}

class B extends A 
{
	protected int b=10;
	void testB()
	{
		System.out.println("This is a method of class B"); 
	}
	
}


public class Test {

	public static void main(String[] args) {
		B ob=new B();
		
		System.out.println(ob.a);
		ob.testA();
		
	    System.out.println(ob.b);
	    ob.testB();

	}

}

