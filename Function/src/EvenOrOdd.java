import java.util.Scanner;

public class EvenOrOdd {
	public static void FindEvenOdd(int num) {
		if(num %2==0) {
			System.out.println("The number is even : " +num);
		}else {
			System.out.println("Number is odd " + num);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer number ");
		int number = sc .nextInt();
		FindEvenOdd(number);
		
		
		
	}

}
