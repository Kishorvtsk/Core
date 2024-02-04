class Employee1{
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void  setName(String n ) {
		name = n;
	}
	
}
public class Q1 {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		emp1.setName("Kishor");
		System.out.println(emp1.getName());
		emp1.salary=85000;
		System.out.println(emp1.getSalary());
	}

}
