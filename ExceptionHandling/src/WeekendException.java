import java.util.Scanner;

public class WeekendException {

	public static void main(String[] args) {
		String day[] = new String[7];
		day[0] = "Sunday";
		day[1] = "Monday";
		day[2] = "Tuesday";
		day[3] = "Wednesday";
		day[4] = "Thurday";
		day[5] = "Friday";
		day[6] = "Saturday";
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
		System.out.println("Enter the day position (0 for Sunday, 1 for Monday, ..., 6 for Saturday");
		try {
		int inputday= sc.nextInt();
		System.out.println("Hey its " +day[inputday] + " have fun!!!");
		flag = false;
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Error!!!!!!!!");
		System.out.println("Please enter days from 0 to 6 ");
	}
}
		}
}
		
