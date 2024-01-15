package com.flowControl;

/*
Write a program to input basic salary of an employee and calculate its Gross salary
according to following rules:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
Gross Salary = Basic Salary + HRA + DA*/
import java.util.Scanner;

public class GrossSalary {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the basic salary of employee");
		int basSal = sc.nextInt();
		int hra=0;
		int Da=0;
		if(basSal>=10000) {
			hra = basSal*20/100;
			Da = basSal*80/100;
			System.out.println("The Hra is : " +hra);
			System.out.println("The DA is :" +Da);
		}
		else if(basSal<=2000) {
			 hra = basSal*25/100;
			 Da = basSal*90/100;
			System.out.println("The Hra is : " +hra);
			System.out.println("The DA is :" +Da);
		}
		else if(basSal>=20000) {
			 hra = basSal*30/100;
			 Da = basSal*95/100;
			System.out.println("The Hra is : " +hra);
			System.out.println("The DA is :" +Da);
		}
		int gs =basSal+hra+Da;
		System.out.println("The gross salary is :" +gs);
	}

}
