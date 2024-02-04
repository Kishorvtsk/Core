class empAddress {
	String name;
	int id;
	int salary;

	public empAddress() {

	}

	public empAddress(int id, int salary) {
		this.id = id;
		this.salary = salary;
		System.out.println("The id of Employee is :" +id);
		System.out.println("The salary of Employee is :" +salary);
	}

}

public class Empolyee {

	public static void main(String[] args) {
		empAddress emp1 = new empAddress(5,7000);

	}

}
