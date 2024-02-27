import java.util.Scanner;

public class MultipleTrycCatch {

	public static void main(String[] args) {
		int mark[] = new int[3];
		mark[0] = 7;
		mark[1] = 56;
		mark[2] = 6;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the value of index");
			int ind = sc.nextInt();
			try {
				System.out.println("Welcome");
				try {
					System.out.println(mark[ind]);
					flag = false;
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Sorry this index doesn't exisit");
					System.out.println("Excepetion in level 2");
				}
			} catch (Exception e) {
				System.out.println("Expection in level 1");
			}
		}
		System.out.println("Thanks for using this program!!!");
	}

}
