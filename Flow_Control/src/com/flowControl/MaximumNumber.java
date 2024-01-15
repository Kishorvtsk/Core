package com.flowControl;

import java.util.Scanner;
//Write a program to find maximum between two numbers.
public class MaximumNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number for find out maximum");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+ " is the maximum number ");
		}else {
			System.out.println(num2+ " is the maximum number");
		}
				
	}

}
