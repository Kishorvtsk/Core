package com.flowControl;

/*Write a program for generating electricity Bill. Accept last month unit and current month
unit from user, then calculate and print bill amount according to following condition:
0-150 charges 4 rs/unit
151-300 charges 6 rs/unit
301-500 charges 8rs/unit
>500 charges 10rs/unit*/

import java.util.Scanner;
public class ElecticBill {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program for generating electricity bill :");
		System.out.println("Enter your last month unit ");
		Double lastUnit = sc.nextDouble();
		System.out.println("Enter your current month unit");
		Double curUnit = sc.nextDouble() ;
		
		Double totalUnit = lastUnit + curUnit;
		
		if(totalUnit>0 && totalUnit>150) {
			System.out.println("charges 4rs/unit");
		} else if(totalUnit>151 && totalUnit>300){
			System.out.println("charges 6rs/unit");
		}else if (totalUnit>301 && totalUnit>500) {
			System.out.println("charges 8rs/unit");
		}
		else {
			System.out.println("charges 10rs/unit");
		}
	}

}
