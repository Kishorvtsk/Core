import java.util.Scanner;

public class Table {
	 public static void Phada(int num) {
		 for(int i=1; i>=10;i++) {
			System.out.format("%d  X  %d ", num,i, num*i);
			
		 }
		 
		 
	 }
	
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter any integer number for table "); int n =
		 * sc.nextInt();
		 */
		Phada(5);
		
		
		
	}

}
