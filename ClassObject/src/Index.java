class Employee{
	int id;
	String name;
	
	public void printDetails() {
		System.out.println("The id of empolye is :"+id);
		System.out.println("and the name of employee is  :" +name);
	}
}


public class Index {

	public static void main(String[] args) {
		System.out.println("This is our custom class ");
		Q1 em1 = new Q1();
		em1.id=5;
		em1.name="kishor";
		
		em1.printDetails();
	
	}

}
