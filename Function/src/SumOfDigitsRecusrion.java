import java.util.Scanner;

public class SumOfDigitsRecusrion {
	public static int  SumofDigit(int a) {
		if(a ==0) {
			return 0;
		}
		return (a%10 + SumofDigit(a/10));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int a = sc.nextInt();
		int res = SumofDigit(a);
		System.out.println("The sum of digit is : "+res);
		}
		
	

}
