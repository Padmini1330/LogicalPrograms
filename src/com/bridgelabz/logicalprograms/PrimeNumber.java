package com.bridgelabz.logicalprograms;

import java.util.Scanner;
public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner object=new Scanner(System.in);
		int number = object.nextInt();
		if(number==0 || number==1)
		{
			System.out.println(number + " is not a prime number");
		}
		else
		{
		    boolean flag = false;
		    for (int index = 2; index <= number / 2; index++) 
		    {
		      if (number % index == 0) 
		      {
		        flag = true;
		        break;
		      }
		    }
	
		    if (!flag)
		      System.out.println(number + " is a prime number");
		    else
		      System.out.println(number + " is not a prime number");
		}

	}

}
