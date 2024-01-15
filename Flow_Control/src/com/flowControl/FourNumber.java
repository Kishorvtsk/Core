package com.flowControl;
import java.util.Scanner;
//Write a program to find the greatest of four numbers entered by the user.

public class FourNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the greatest of four number entered by user ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		if(num1>num2 && num1>num3 && num1>num4) {
			System.out.println(+num1+ "Greatest of four");
		}else if(num2>num1 && num2>num3 && num2>num4) {
			System.out.println( +num2+ "Greates of four");
		}else if (num3>num1 && num3>num2 && num3>num4) {
			System.out.println(+num3+ "Greatest of four");
		}else {
			System.out.println(+num4+ "Greatest of four");
		}
		
	}

}
