package com.inheritance;

class Animal
{
	public void animalTest()
	{
		System.out.println("This is animal class test method");
	}
}

class Dog extends Animal
{
	public void DogTest()
	{
		System.out.println("This is Dog class test method");
	}
}

class Tiger extends Animal
{
	public void tigerTest()
	{
		System.out.println("This is Tiger class test method");
	}	
	
}




public class HierarchicalInheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.animalTest();
		d.DogTest();
		
		
		Tiger t=new Tiger();
		t.animalTest();
		t.tigerTest();

	}

}
