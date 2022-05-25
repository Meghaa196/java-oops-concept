package com.java;

public class ContinutTest {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		
		moveto:
		for(int j=1;j<=5;j++)
		{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue moveto;
			}
			System.out.println(i 
package com.java;

public class BreakTest {

	public static void main(String[] args) {
	
	int n=10,i;
	abc:
	for(int j=1;j<=n;j++)
	{
		
		for(i=1;i<=n;i++)
		{
			if(i==5)
			{
				break abc;
			}
			System.out.println(i+" "+j);
		}
      
	}
	}
}
