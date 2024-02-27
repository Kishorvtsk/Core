import java.util.Scanner;

public class SelfTaught {

	public static void main(String[] args) {
		// consistency and decipline
		String[] quality = new String[5];
		quality[0] = "Focus";
		quality[1] = "Dicipline";
		quality[2] = "Hardwork";
		quality[3] = "SmartWork";
		quality[4] = "consistency";
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("You have 5 special power");
			try {
				int number = sc.nextInt();
				System.out.println("Please enter from 0 to 4");
				System.out.println("Here is your power " + quality[number]);
				flag = false;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("error");
			}
		}

	}

}
