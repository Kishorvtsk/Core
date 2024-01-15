package com.flowControl;

import java.util.Scanner;

//Write a program to accepts three numbers from user and calculate biggest number out of three numbers.
public class BiggestOutOfThree {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three integer value to calculate biggest number out of three numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z= sc.nextInt();
		
		if(x>y && x>z ) {
			System.out.println("The number x is biggest of three " +x);
		}
		else if(y>x && y>x){
			System.out.println("The number y is biggest of three " +y);
		}else {
			System.out.println("The number z is biggest of three "+z);
		}
		
		
	}
	

}
