package com.loop.fc;
import java.util.Scanner;
public class EvenNumber {
	public static void main(String args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter number ");
		int num = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			if(num%2==0) {
				System.out.println("Number is even");
			}else {
				System.out.println("not even");
			}
		}
		System.out.println(num);
			
		}
	}


