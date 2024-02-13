interface Taxable {
	double getTaxRate();

	double getTax();
}

class Employee implements Taxable {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("The id of Employe is " + id);
		System.out.println("The name of Employe is " + name);
		System.out.println("The salary of Employe is " + salary);
	}

	@Override
	public double getTaxRate() {
		if (salary > 1000000) {
			return 0.3;
		} else if (salary > 50000) {
			return 0.2;
		} else {
			return 0.06;
		}
	}

	@Override
	public double getTax() {
		return salary * getTaxRate();
	}
}

class Restaurent implements Taxable {
	String RestroName;
	double billAmount;

	public Restaurent(String restroName, double billAmount) {

		RestroName = restroName;
		this.billAmount = billAmount;
	}

	public void display() {
		System.out.println("Resturant name :" + RestroName);
		System.out.println("Bill amount :" + billAmount);
	}

	@Override
	public double getTaxRate() {
		return 0.1;
	}

	@Override
	public double getTax() {
		return billAmount * getTaxRate();
	}

}

public class Tax {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "John", 1200000);
        Employee employee2 = new Employee(2, "Alice", 600000);

        // Creating Restaurent objects
        Restaurent restaurent1 = new Restaurent("Food Palace", 5000);
        Restaurent restaurent2 = new Restaurent("Pizza Hut", 10000);
        Restaurent restaurent3 = new Restaurent("Burger King", 20000);

        // Displaying and calculating tax for employees
        employee1.display();
        System.out.println("Tax: " + employee1.getTax());

        employee2.display();
        System.out.println("Tax: " + employee2.getTax());

        // Displaying and calculating tax for restaurants
        restaurent1.display();
        System.out.println("Tax: " + restaurent1.getTax());

        restaurent2.display();
        System.out.println("Tax: " + restaurent2.getTax());

        restaurent3.display();
        System.out.println("Tax: " + restaurent3.getTax());

        // Total tax on all objects
        double totalTax = employee1.getTax() + employee2.getTax() + restaurent1.getTax() + restaurent2.getTax() + restaurent3.getTax();
        System.out.println("Total Tax on all objects: " + totalTax);

        // Applying 5% refund on tax
        applyRefund(employee1);
        applyRefund(employee2);
        applyRefund(restaurent1);
        applyRefund(restaurent2);
        applyRefund(restaurent3);
    }

    // Global function to apply 5% refund on tax
    public static void applyRefund(Taxable taxable) {
        double tax = taxable.getTax();
        double refund = tax * 0.05;
        System.out.println("5% refund on tax applied: " + refund);
    }


	}

