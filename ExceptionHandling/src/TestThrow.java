class UserDefinedException extends  Exception{
	public UserDefinedException(String name ) {
		super(name);
	}
	
}
public class TestThrow {
	/*
	 * public static void validate(int age) { if(age<18) { throw new
	 * ArithmeticException("Person is not eligible "); }else {
	 * System.out.println("Person is eligible to vote"); } }
	 */

	public static void main(String[] args) {
		/*
		 * TestThrow.validate(11); System.out.println("rest of the code ");
		 */
		
		try {
			throw new UserDefinedException("This is user-defined exception");
		}catch(UserDefinedException e) {
			System.out.println("Caught the exception");
			System.out.println(e.getMessage());
			
		}
		
		
	}

}
