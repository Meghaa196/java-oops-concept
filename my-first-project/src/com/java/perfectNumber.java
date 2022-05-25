package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int number;
		System.out.println("Enter any number:");
		number=Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=1;i<=number-1;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==number)
		{
			System.out.println("It's a Perfect Number");
		}
		else
		{
			System.out.println("It's not a Perfect Number");
		}

	}

}
