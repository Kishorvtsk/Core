package com.loop.fc;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int rev=0;
		for(int i=0;i<num;i--) {
			int rem = num%10;
			rev =rev*10+rem;
			num= num/10;
		}
		System.out.println(rev);
		
	}

}
