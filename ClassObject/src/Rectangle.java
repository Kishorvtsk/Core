class rectForm{
	int length;
	int breadth;
	int area;
	
	public void inputValue(int l,  int b) {
		length=l;
		breadth=b;
	}
	
	public void calculateArea() {
		int area = length*breadth;
		System.out.println("The area of rectangle is :" +area);
	}
	public void showArea() {
		calculateArea();
	}
}
public class Rectangle {
	public static void main(String[] args) {
		rectForm rect = new rectForm();
		rect.inputValue(5, 8);
		rect.showArea();

	}

}
