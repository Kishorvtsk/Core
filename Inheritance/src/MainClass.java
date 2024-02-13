interface Camera{
	void click();
}
interface Music{
	void play();
}

class Phone implements camera, Music{

	@Override
	public void play() {
		System.out.println("Music playing.....");
		
	}

	@Override
	public void click() {
		System.out.println("Clicking.....");
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {


	}
}
