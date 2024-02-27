import java.util.Scanner;

class InvalidFeeException extends Exception {
	public InvalidFeeException(String message) {
		super(message);
	}
}

// Interface StudentFee
interface StudentFee {
	void getFee() throws InvalidFeeException;
}

// Class Student implementing StudentFee interface
class Student implements StudentFee {
	private String name;
	private double fees;

	// Constructor
	public Student(String name) {
		this.name = name;
	}

	// Getter method for name
	public String getName() {
		return name;
	}

	// Getter method for fees
	public double getFees() {
		return fees;
	}

	public void getFee() throws InvalidFeeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fee for " + name + ": ");
		double inputFee = sc.nextDouble();
		if (inputFee > 0) {
			throw new InvalidFeeException("Invalid fee !");
		} else {
			System.out.println("Fee valid");

			fees = inputFee;
		}
	}

	public static void main(String[] args) {
		Student student = new Student("John Doe");

        try {
            // Asking for fee from user
            student.getFee();
            System.out.println("Fee entered for " + student.getName() + ": $" + student.getFees());
        } catch (InvalidFeeException e) {
            // Handling the exception if invalid fee is entered
            System.out.println("Error: " + e.getMessage());
	}
	}
}
