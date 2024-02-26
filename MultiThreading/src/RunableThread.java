class Run implements Runnable {
	public void run() {
		System.out.println("I am thread1 not a threat1");
		System.out.println("I am thread1 not a threat1");
		System.out.println("I am thread1 not a threat1");
		System.out.println("I am thread1 not a threat1");
		System.out.println("I am thread1 not a threat1");
		System.out.println("I am thread1 not a threat1");
		System.out.println("I am thread1 not a threat1");
		System.out.println("I am thread1 not a threat1");
		System.out.println("I am thread1 not a threat1");
		System.out.println("I am thread1 not a threat1");
		System.out.println("I am thread1 not a threat1");

	}
}

class Run2 implements Runnable {
	public void run() {
		System.out.println("I am thread2 not a threat2");
		System.out.println("I am thread2 not a threat2");
		System.out.println("I am thread2 not a threat2");
		System.out.println("I am thread2 not a threat2");
		System.out.println("I am thread2 not a threat2");
		System.out.println("I am thread2 not a threat2");
		System.out.println("I am thread2 not a threat2");
		System.out.println("I am thread2 not a threat2");
		System.out.println("I am thread2 not a threat2");
		System.out.println("I am thread2 not a threat2");

	}
}

public class RunableThread {

	public static void main(String[] args) {
		Run bullet1 = new Run();
		Thread gun1 = new Thread(bullet1);

		Run2 bullet2 = new Run2();
		Thread gun2 = new Thread(bullet2);

		gun1.start();
		gun2.start();

	}

}
