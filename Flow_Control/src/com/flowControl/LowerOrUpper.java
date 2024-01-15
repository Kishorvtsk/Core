package com.flowControl;

import java.util.Scanner;

public class LowerOrUpper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any alphate to check it wheater its upper or lower ");
		char value = sc.next().charAt(0);
		
		if(Character.isUpperCase(value)) {
			System.out.println("Character is uppercase");
		}else {
			System.out.println("Charter is lowercase");
		}
	}

}
