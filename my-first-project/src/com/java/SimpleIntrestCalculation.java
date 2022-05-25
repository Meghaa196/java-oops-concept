package com.java;

public class SimpleIntrestCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principalAmount,rateOfInterest,timeInYear; //Camel casing variable name
		
		//Variable Initialization
		principalAmount=1000;
		rateOfInterest=5;
		timeInYear=4;
		
		double interestAmount=(principalAmount*rateOfInterest*timeInYear)/100;
		
		System.out.println("InterestAMount="+interestAmount);
	}

}
