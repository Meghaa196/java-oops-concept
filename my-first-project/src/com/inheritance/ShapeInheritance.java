package com.inheritance;

class Shape{
	
public void shapeTest()
{
	System.out.println("This is shape");
}
}

class Rectangle extends Shape
{
	public void RectangleTest()
	{
		System.out.println("This is Rectangular Shape");
	}
}

class Square extends Rectangle
{
	public void CircleTest()
	{
		System.out.println("Square of Rectangle");
	}	
	
}

class Circle extends Shape
{
	public void CircleTest()
	{
		System.out.println("This is Circular Shape");
	}	
	
}


public class ShapeInheritance {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.shapeTest();
		r.RectangleTest();
		
		
		Circle c=new Circle();
		c.shapeTest();
		c.CircleTest();

	}

}
