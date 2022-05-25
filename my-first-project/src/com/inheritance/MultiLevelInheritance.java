package com.interitance;
class A1
{
	protected int a=20;
	void testA1()
	{
		System.out.println("This is a method of class A1 ");
	}
	
}

class B1 extends A1
{
	protected int b=50;
	void testB1()
	{
		System.out.println("This is a method of class B1 ");
	}
}

class C1 extends B1
{
	protected int c=20;
	void testC1()
	{
		System.out.println("This is a method of class C1 ");
	}
	
	
	
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		C1 ob=new C1();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		
		
		ob.testA1();
		ob.testB1();
		ob.testC1();
		

	}

}
