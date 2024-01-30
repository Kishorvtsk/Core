
public class FirstNaturalNoSum {
	static int sumReact(int n) {
		if(n==1) {
			return 1;
		}
			return n +sumReact(n-1);
		
	}
		public static void main(String[] args) {
		int c =sumReact(3);
		System.out.println(c);
}
}
