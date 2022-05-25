package com.inheritance;

public class AreaImplementation implements Area {

	@Override
	public void reactangleArea() {

		System.out.println("This is rectangle Area method");
		
	}

	@Override
	public void circleArea() {
		System.out.println("This is circle Area method");
		
	}
	
	
	public static void main(String args[])
	{
		Area ob=new AreaImplementation();
		ob.circleArea();
		ob.reactangleArea();
	}

}
