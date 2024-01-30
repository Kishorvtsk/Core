import java.util.Scanner;
public class NaturalSum {
	public static void addNatural(int i, int num ,int sum){
		if(i==num) {
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		addNatural(i+1, num, sum);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number ");
		int num = sc.nextInt();
		addNatural(1, num, 0);
	}

}
