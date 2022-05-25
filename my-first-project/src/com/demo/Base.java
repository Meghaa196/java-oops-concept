package com.demo;

abstract  class Base {
	
	abstract void test(); //abstract method
	
	void welcome()
	{
		System.out.println("Welcome");
	}
	
	static void bye()
	{
		System.out.println("Good Bye...");
	}

	final void waitUser()
	{
		System.out.println("Wait for sometime..");
	}
	
}


class Sub extends Base
{

	@Override
	void test() {
		System.out.println("Body of test method");
		
	}
	
	
	
}

class TestAbstract
{
	public static void main(String args[])
	{
		Base ob=new Sub();
		ob.welcome();
		ob.test();
		ob.waitUser();
		Base.bye();
		
	}
}
