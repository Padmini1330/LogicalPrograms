package com.bridgelabz.logicalprograms;

import java.util.Scanner;
public class CouponNumbers 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the N value");
		int numberOfCoupons=scanner.nextInt();
		int couponNumbers[]=new int[numberOfCoupons];
		System.out.println("Enter "+numberOfCoupons+" distinct coupon numbers");
		for(int index=0;index<numberOfCoupons;index++)
		{
			couponNumbers[index]=scanner.nextInt();
			
		}
		randomNumbers(couponNumbers);
		
		
	
	}

	private static void randomNumbers(int couponNumbers[]) 
	{
		int count=0;
		int iterations=0;
		while(count!=couponNumbers.length)
		{
			int randomNumber=(int)(Math.random()*9) + 1;
			for(int index=0;index<couponNumbers.length;index++)
			{
				if(randomNumber==couponNumbers[index]) {
					count++;
					couponNumbers[index]=-1;
				}
			}
			iterations++;
			
		}
		System.out.println(iterations);
		
	}

}
