package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		Scanner object=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=object.nextInt();
		int reverse=0;
		while(number!= 0)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		System.out.println("Reverse of number is: "+ reverse);

	}

}
