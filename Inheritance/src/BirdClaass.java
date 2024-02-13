abstract class FlyingStyle{
	abstract void fly();
	
	void UpOnsky() {
		System.out.println("The bird is on up on the sky");
	}
}

class Bird extends FlyingStyle{
	@Override
	void fly() {
		System.out.println("Bird is flying...");
	}
}
public class BirdClaass {

	public static void main(String[] args) {
		Bird obj = new Bird();
		obj.fly();
		obj.UpOnsky();
		
	}

}
