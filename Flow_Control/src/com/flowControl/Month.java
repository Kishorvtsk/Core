package com.flowControl;
import java.util.Scanner;

/*Write a program to show name of month . Ask user to enter between 1 and 12. Use
switch case.*/
public class Month {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number between 1 and 12");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: System.out.println("1 for january");
		break;
		
		case 2: System.out.println("2 for Feburary");
		break;
		
		case 3: System.out.println("3 for March");
		break;
		
		case 4: System.out.println("4 for April");
		break;
		
		case 5: System.out.println(" 5 for June");
		break;
		
		case 6: System.out.println(" 6 for July");
		break;
		
		case 7: System.out.println(" 7 for August");
		break;
		
		case 8: System.out.println(" 8 for September");
		break;
		
		case 9: System.out.println("9 for november");
		break;
		
		case 10: System.out.println(" 10 for Octomber");
		break;
		
		case 11: System.out.println(" 11 for November");
		break;
		
		case 12: System.out.println(" 12 for December");
		break;
		
	}
	}
}
