package com.flowControl;
/*
Write a program that accepts five subjects ’marks from user and calculate the total marks
then calculate Percentage. Display message according to following condition:
Percentage >=60 then print message Grade A
Percentage >=50 then print message Grade B
Percentage >= 40 then print message Grade C
Percentage < 40 then print message Grade D*/

import java.util.Scanner;
public class FiveSubjectt {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of all subject");
		
		System.out.println("Enter the marks of English");
		Double English = sc.nextDouble();
		System.out.println("Enter the marks of Math");
		Double Math = sc.nextDouble();
		System.out.println("Enter the marks of Hindi");
		Double Hindi = sc.nextDouble();
		System.out.println("Enter the marks of Science");
		Double Science = sc.nextDouble();
		System.out.println("Enter the marks of Sanskrit");
		Double Sanskrit = sc.nextDouble();
		
		Double Total = English+Math+Hindi+Science+Sanskrit;
		Double Percentage = Total/500*100;
		
		if(Percentage>=60) {
			System.out.println("Grade A");
		}else if (Percentage>=50 ) {
			System.out.println("Grade B");
		}else if (Percentage>=40) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade D");
		}
		
		
	}

}
