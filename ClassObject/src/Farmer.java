class comFarmer {
	String name;
	String crop;
	int earning;

	public comFarmer() {

	}

	public comFarmer(String name, String crop, int earning) {
		this.name = name;
		this.crop = crop;
		this.earning = earning;

	}

	public void displayFunction() {
		System.out.println("The name of farmer is :" + name);
		System.out.println("The id of farmer is :" + crop);
		System.out.println("The salary of farmer is :" + earning);
		System.out.println("\n");

	}
	public static void compareEarning(comFarmer farmer1 , comFarmer farmer2 ) {
		if(farmer1.earning>farmer2.earning) {
			System.out.println("Farmer 1 is earn more ");
		}else if(farmer2.earning>farmer1.earning) {
			System.out.println("Farmer 2 is earn more ");
		}else {
			System.out.println("Both earn same ");
		}
	}
}

public class Farmer {

	public static void main(String[] args) {

		comFarmer farmer1 = new comFarmer("kishor", "ravi", 80);
		farmer1.displayFunction();
		comFarmer farmer2 = new comFarmer("sonu", "raniny", 600);
		farmer2.displayFunction();
		
			
		}


		
	}



