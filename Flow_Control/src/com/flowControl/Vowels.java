package com.flowControl;
//Write a program that accepts a character and check given character is vowel or not by using switch case.

import java.util.Scanner;
public class Vowels {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the VOWELS");
		String vowels = sc.next();
		
		switch(vowels) {
		case "a": System.out.println("A is vowels");
		break;
		case"e": System.out.println("E is vowels");
		break;
		case "i":System.out.println("I is vowels");
		break;
		case "o":System.out.println("O is vowels");
		break;
		case "u": System.out.println("U is vowels");
		break;
		default:System.out.println("Error");
		}
	}

}
