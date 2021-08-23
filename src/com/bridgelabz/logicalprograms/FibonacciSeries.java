package com.bridgelabz.logicalprograms;

import java.util.Scanner;
public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner object=new Scanner(System.in);
		System.out.println("Enter fibonacci limit");
		int fibonacciLimit=object.nextInt();
		int previousNumber=0;
		int currentNumber=1;
		System.out.print(previousNumber+","+currentNumber);
		for(int index=2;index<=fibonacciLimit;index++)
		{
			int nextNumber=previousNumber+currentNumber;
			previousNumber=currentNumber;
			currentNumber=nextNumber;
			System.out.print(","+ nextNumber);
		}
		  

	}

}
