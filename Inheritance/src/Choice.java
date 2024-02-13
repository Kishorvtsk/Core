import java.util.Scanner;
abstract class Processor {
	int data;
	abstract void process();

	void showData() {
		System.out.println("Data: " + data);
	}
}
class Factorial extends Processor {
	Factorial(int n) {
		data = n;
	}
	@Override
	void process() {
		int factorial = 1;
		for (int i = 1; i <= data; i++) {
			factorial *= i;
		}
		System.out.println("Factorial of " + data + " is: " + factorial);
	}
}

class Circle extends Processor {
	Circle(int radius) {
		data = radius;
	}

	@Override
	void process() {
		double area = Math.PI * data * data;
		System.out.println("Area of circle with radius " + data + " is: " + area);
	}
}
public class Choice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your choice (factorial or circle area): ");
		String choice = scanner.nextLine();

		System.out.println("Enter the data to work upon: ");
		int data = scanner.nextInt();

		Processor processor = null;

		if (choice.equalsIgnoreCase("factorial")) {
			processor = new Factorial(data);
		} else if (choice.equalsIgnoreCase("circle area")) {
			processor = new Circle(data);
		} else {
			System.out.println("Invalid choice!");
			return;
		}

		if (processor != null) {
			processor.showData();
			processor.process();
		}

		scanner.close();
	}
}