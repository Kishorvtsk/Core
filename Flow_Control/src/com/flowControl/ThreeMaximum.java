package com.flowControl;

import java.util.Scanner;

public class ThreeMaximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Find out maximum from three");
		System.out.println("Enter number one ");
		int num1 = sc.nextInt();
		System.out.println("Enter number two");
		int num2 = sc.nextInt();
		System.out.println("Enter number three");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println( num1+ " number is maximum");
		}
		if-else(num2>num1 && num2>num3){
			System.out.println( num2+ "number is maximum");
		}
	}

}
