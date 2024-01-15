package com.flowControl;

//Write a program to perform all arithmetic operations according to user choice (for ex-foraddition press ‘+’...) by using switch case

import java.util.Scanner;
public class ArithmeticOperations {
	
	public static void main(String[] args) {
		
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, or /");
		operator = sc.next().charAt(0);

		System.out.println("Enter any two integer number for perfoming opertion");
		
		int x = sc.nextInt();
		int y = sc. nextInt();
		int result ;
		switch (operator) {
		case '+':
			result = x+y;
			System.out.println("the sum of number is " +result);
			break;
		case '-':
			result = x-y;
			System.out.println("the sum of number is " +result);
			break;	
		case '*':
			result = x*y;
			System.out.println("the sum of number is " +result);
			break;	
		case '/':
			result = x/y;
			System.out.println("the sum of number is " +result);
			break;	
		
		}
	}
	
}

