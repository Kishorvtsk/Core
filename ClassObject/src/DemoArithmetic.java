class Operations{
	int firstNo;
	int seconNo;
	int result;
	
	public void inputValue(int f, int s) {
		firstNo = f;
		seconNo = s;
	}
	public void addition() {
		result = firstNo+seconNo;
		System.out.println("Addition of two number is : " +result);
	}
	public void substraction() {
		result = firstNo-seconNo;
		System.out.println("Substraction of two number is : " +result);
	}
	public void multipliaction() {
		result = firstNo*seconNo;
		System.out.println("multiplication of two number is : " +result);
	}
	public void divide() {
		result = firstNo/seconNo;
		System.out.println("Divide of two number is : " +result);
	}
	
	public void show (){
	addition();
	substraction();
	multipliaction();
	divide();
	}
	
}
public class DemoArithmetic {

	public static void main(String[] args) {
		Operations op = new Operations();
		op.inputValue(5, 5);
		op.show();
		
		
	}

}
