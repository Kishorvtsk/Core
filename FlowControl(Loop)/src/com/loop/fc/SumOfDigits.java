package com.loop.fc;
import java.util.*;
//Write a program to calculate sum of digits of a number.

public class SumOfDigits {
	public static void main(String args[] ) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number for  sum ");
		int num = sc.nextInt();
		int sum=0;
		for(int i =0; i<num;i--) {
			int digit = num%10;
			sum = sum+digit;
			num =num/10;
		}
		System.out.println(sum);
			

}
}