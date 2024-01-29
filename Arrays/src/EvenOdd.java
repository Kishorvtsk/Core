
public class EvenOdd {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,4,7};
		/* int n = arr.length; */
		int countEven = 0, countOdd = 0;
		
		for(int i =0;i<arr.length;i++) {
			if((arr[i]%2)==0) {
				countEven +=1;
			}else {
				countOdd +=1;
			}
		}
		System.out.println("Total number of even values: " +countEven);
		System.out.println("total number of odd values: "+countOdd);
	}
}
