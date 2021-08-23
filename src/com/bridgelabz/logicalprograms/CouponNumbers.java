package com.bridgelabz.logicalprograms;

import java.util.Scanner;
public class CouponNumbers {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		System.out.println("Enter the N value");
		int numberOfCoupons=object.nextInt();
		int couponNumbers[]=new int[numberOfCoupons];
		System.out.println("Enter "+numberOfCoupons+" distinct coupon numbers");
		for(int index=0;index<numberOfCoupons;index++)
		{
			couponNumbers[index]=object.nextInt();
			
		}
		randomNumbers(couponNumbers);
		
		
	
	}

	private static void randomNumbers(int couponNumbers[]) {
		
		
		
		
	}

}
