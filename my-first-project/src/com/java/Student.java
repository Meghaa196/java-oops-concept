package com.java;

public class Student {

	private long studentId;
	private String studentName;
	private String studentAddress;
	private long phoneNumber;
	
	void attendClasses()
	{
		System.out.println("This is attend class method.");
	}
	void exam()
	{
		System.out.println("This is exam method");
	}
	void checkResult()
	{
		System.out.println("This is check result number");
	}
	public static void main(String agrs[])
	{
		Student student1=new Student();
		student1.studentId=101;
		student1.studentName="Raman";
		student1.studentAddress="Mumbai";
		student1.phoneNumber= 123456;
		
		System.out.println(student1.studentId+" "+student1.studentName+" "+student1.studentAddress+" "+student1.phoneNumber+" ");
		
				student1.attendClasses();
				student1.exam();
				student1.checkResult();

	}
	
}
