package com.flowControl;
import java.util.Scanner;
public class Voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person");
		Double age = sc.nextDouble();
		
		if(age>18) {
			System.out.println("Eligible for vote");
		}else {
			System.out.println("not eligible for vote");
		}
		
		
	}
	
	
	

}
