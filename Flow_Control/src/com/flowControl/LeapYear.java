package com.flowControl;

//Write a program to calculate whether year is leap year or not.
import java.util.Scanner;
public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the yeare for check wheather is leap year or not");
		int year = sc.nextInt();
		if(year%4==0) {
			System.out.println( +year+ " is leap year ");
		}else {
			System.out.println( +year+ " is not leap year ");
		}
		
	}

}
