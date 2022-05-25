package com.java;

public class ArmstrongNumber {

	
		public static void main(String[] args) {
			int number = 155, rem , number1 , total = 0,counter=0;
			 number1 = number;
			 int copyOfNumber=number;
			 
			 while(copyOfNumber>0)                 //153>0 True     15>0 T   1>0
			 {
				 counter=counter+1;                // counter=0+1=1 1+1+2     2+1=3
				 copyOfNumber=copyOfNumber/10;     //153/10=15      15/10=1   1/10=0
			 }
			 
		//	 String n=Integer.toString(copyOfNumber);
		//	 int length=n.length();
			 
			 
			 
			 
			 
			 while (number1 != 0)
			 {
				 rem = number1 % 10;				
				 total = total +(int)Math.pow(rem, counter);
				 number1=number1/10;
				 
			 }
			 
			 if (total == number)
				 System.out.println(number + " is an Armstrong number");
		        else
		            System.out.println(number + " is not an Armstrong number");

		}

	


}
