package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialCalculation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int number,fact=1;
		System.out.println("Enter any number:");
		number=Integer.parseInt(br.readLine());

		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	}

}
