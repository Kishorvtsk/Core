import java.util.Scanner;

public class Cube {
	public static void numberCube(int x) {
		int multi = x*x*x;
		System.out.println("The cube of " +x+ " is " +multi);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for cube ");
		int num = sc.nextInt();
		numberCube(num);
		

	}

}
