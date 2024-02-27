class Throws {
	public static int divideNum(int m, int n) throws ArithmeticException {
		int div = m / n;
		return div;
	}
}

class TestThrowThrows {
	static void method() throws ArithmeticException  
    {  
        System.out.println("Inside the method()");  
        throw new ArithmeticException("throwing ArithmeticException");  
    }  

}

public class TestThrows {

	public static void main(String[] args) {
		Throws obj = new Throws();
		try {
			System.out.println(obj.divideNum(5, 0));
		} catch (ArithmeticException e) {
			System.out.println("\nNumber cant be divided by zero");
		}
		System.out.println("Rest of the code");
		
		try  
        {  
            method();  
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println("caught in main() method");  
        }  
		
	}
	

}
