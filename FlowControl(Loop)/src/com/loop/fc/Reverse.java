package com.loop.fc;
import java.util.Scanner;
public class Reverse {
	public static void main(String args[]) {
		int rev =0;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter numbers");
		int num = sc.nextInt();
		
		for(int i=1; i<=num;i--) {
			int digit = num %10;
			rev = rev*10+digit;
		}
		System.out.println(rev);
	}
}
