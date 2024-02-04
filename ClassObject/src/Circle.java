class demoCir {
	int radius;
	int area;

	public demoCir() {
		this.radius = 1;
	}

	public demoCir(int radius) {
		this.radius = radius;
	}

	public void display() {
		System.out.println("The radius of circle is :" + radius);
		area = (22 / 7 * radius);
		System.out.println("The area of circle is :" + area);
		System.out.println("");
	}

	public boolean isBiggerThan(demoCir other) {
		return this.radius > other.radius;
	}
}

public class Circle {

	public static void main(String[] args) {
		demoCir rad = new demoCir(1);
		rad.display();
		demoCir rad2 = new demoCir(5);
		rad2.display();

		boolean result = rad.isBiggerThan(rad2);
		System.out.println("Circle 1 is bigger than Circle 2: " + result);
	}

}
