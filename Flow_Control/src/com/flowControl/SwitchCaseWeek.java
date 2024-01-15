package com.flowControl;

// Write a program to show day of week according to user input by using switch case.
import java.util.Scanner;
public class SwitchCaseWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for days name ");
		int num = sc.nextInt();
		
switch (num) {
		
		case 1:
		
			System.out.println("The day is monday");
		
		break;
		case 2:
			
				System.out.println("The day is tuesday");
			
			break;
		case 3: 
			
				System.out.println("The day is wednesday");
			
			break;
		case 4: 
			
				System.out.println("The day is thurday");
			
			break;

		case 5: 
			
				System.out.println("The day is friday");
			
			break;
		case 6: 
			
				System.out.println("The day is saturday");
			break;
		case 7: 
			
				System.out.println("The day is sunday");
			
			break;
		 default:
		        System.out.println("Invalid day number.");
		        break;  
}
	}
}

	