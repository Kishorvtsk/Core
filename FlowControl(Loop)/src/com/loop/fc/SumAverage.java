package com.loop.fc;

//Take any ten numbers from user and print sum and average of these numbers.
import java.util.Scanner;
public class SumAverage {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i , n ,num,sum=0;
		float avg;
		System.out.println("Enter the no. of elements");
		n = sc.nextInt();
		System.out.println("Enter " +n+ " elements :\n");
		for(i=1;i<=n;i++) {
			num = sc.nextInt();
			sum = sum+num;
		}
		avg =(float)sum/n;
		
		System.out.println("sum " +sum);
		System.out.println("Average " +avg);
		}
		
	

}
