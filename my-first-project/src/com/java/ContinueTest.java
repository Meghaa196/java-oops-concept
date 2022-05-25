package com.java;

public class ContinueTest {

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
			System.out.println(i + " "+j);
		}

	}

}
}
