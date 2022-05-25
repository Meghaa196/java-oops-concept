package com.java;

import java.util.Scanner;

public class KrishnaMurtyNumber {

	public static void main(String[] args) {
		
		int number,rem,copyOfNumber,sum=0,fact=1;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number=");
		number=scan.nextInt();
		copyOfNumber=number;
		
		while(number>0)
		{
			rem=number%10;
            int i=1;			
			while(i<=rem)
			{
				fact=fact*i;
				i++;
			}
			
			sum=sum+fact;
			number=number/10;
			fact=1;
		}
		
		
		if(sum==copyOfNumber)
		{
			System.out.println("It is a Krishnamurty or Peterson Number");
		}
		else
		{
			System.out.println("It is not a Krishnamurty or Peterson Number");
		}

	}

}
