import java.util.Scanner;

class Const {
	String name;
	int id;
	int salary;

	Const(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void display() {
		System.out.println("The name of person is " + name);
		System.out.println("id of person is " + id);
		System.out.println("Salary of person is " + salary);
	}
}

public class Bullet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name , id , salary");
		String name = sc.next();
		int id = sc.nextInt();
		int salary = sc.nextInt();
		Const bullet = new Const(name, id, salary);
		bullet.display();
	}

}
