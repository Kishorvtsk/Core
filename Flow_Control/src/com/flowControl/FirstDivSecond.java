package com.flowControl;

//Write a program to accepts two numbers from user and calculates first no is divisible by second or not
import java.util.Scanner;

public class FirstDivSecond {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two integer number two check first no is divisible by second or not");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1%num2 ==0) {
			System.out.println("First num is divisible by Second  ");
		}else {
			System.out.println("First num is not divisible by Second");
		}
		
	}

}
