package com.flowControl;

// Write a program to accepts a number from user and check given number is even or odd.
import java.util.Scanner;
	
public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the any integer value to check wheather it Even of odd");
		int x = sc.nextInt();
		
		if(x%2==0) {
			System.out.println("The number is even " +x);
		}else {
			System.out.println("The number is odd " +x);
		}
		

	}

}
