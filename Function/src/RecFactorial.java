
public class RecFactorial {
	public static int findFact(int num) {
		if(num==1|| num ==0 ){
			return 1;
		}
		int fact =findFact(num-1);
		int finFact = num*fact;
		return finFact;
		
	}

	public static void main(String[] args) {
			int n =5;
			int ans = findFact(n);
			System.out.println(ans);
	}

}
