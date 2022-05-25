package com.interitance;

interface SolarSystem
{	
	void testSolarSystem();
}

interface Earth extends SolarSystem
{
	void testEarth();
}

interface Mars extends SolarSystem
{
	void testMars();
}


interface Moon extends Earth,Mars
{
	void testMoon();
}

class MoonImplementation implements Moon
{

	@Override
	public void testEarth() {
		System.out.println("This is Earth method");
		
	}

	@Override
	public void testSolarSystem() {
		System.out.println("This is Solar System method");		
	}

	@Override
	public void testMars() {
		
		System.out.println("This is Mars method");
		
	}

	@Override
	public void testMoon() {
		System.out.println("This is Moon method");
		
	}
	
}


public class HybridInheritance {

	public static void main(String[] args) {
		Moon moon=new MoonImplementation();
		moon.testSolarSystem();
		moon.testEarth();
		moon.testMars();
		moon.testMoon();

	}

}
