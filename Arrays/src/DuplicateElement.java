
public class DuplicateElement {

	public static void main(String[] args) {
		int []arr = {1,2,3,5,6,7,7,1,};
		int delete=0;
			for(int i =0; i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						System.out.println("duplicate value is :"+arr[j]);
						delete = arr[j]*0;
						
					}
				}
				System.out.println(delete);			
	}
			
}
	
}
