class Addition {
	float num1, num2, num3;
	int[] arr ;
	int a1, b2;

	public void floatFunction(float n1, float n2, float n3) {
		num1 = n1;
		num2 = n2;
		num3 = n3;
		System.out.println("Three float number are : " +num1+num2+num3);
	}
	
	public void arrayFunction(int []r) {
		this.arr=r;
		for (int i =0;i<arr.length;i++) {
			System.out.println("Arrays number are  : "+arr[i]);	
		}
	}
	
	public void twoIntFunction(int a,int b) {
		a1=a;
		b2=b;
		System.out.println("Integer number 1 is :" +a1);
		System.out.println("Integer number 2 is :"+b2 );
	}
	
	
}

public class School {

	public static void main(String[] args) {
		
		Addition add = new Addition();
		System.out.println("Method floatFunction call");
		add.floatFunction(77.6f,66.4f,253f);
		
		System.out.println("Method twoIntFunction call");
		add.twoIntFunction(5, 4);
		
		add.arrayFunction(null);
		

	}

}
