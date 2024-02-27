import java.util.Scanner;

public class ExcepetionHande {

	public static void main(String[] args) {
		int mark[] = new int[3];
		mark[0]=7;
		mark[1]=56;
		mark[2]=6;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array index");
		int ind = sc.nextInt();
		
		System.out.println("Enter the number you want to divide the value with");
		int number =sc.nextInt();
		try {
			System.out.println("The value at array index entered index is :" +mark[ind]);
			System.out.println("The value of array value /number is " +mark[ind]/number);
		}catch(Exception e) {
			System.out.println("Some excepetion occured!");
			System.out.println();
		}
		
	}
	

}
