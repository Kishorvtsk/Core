package com.flowControl;
/*Write a program that accepts a number from user and find whether it is positive or
negative or zero*/

import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String atg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for check wheather is positive ot negative");
		Double num= sc.nextDouble();
		
		if(num>=0) {
			System.out.println("Number is positive:" +num);
		}else {
			System.out.println("Number is negative: "+num);
		}
		
	}

}
