class One extends Thread {
	public void run() {
		while (true) {
			System.out.println("Good Morning");
		}
	}
}

class Two extends Thread {
	public void run() {
		while (true) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Welcome");
		}
	}
}

public class HiiWelc {

	public static void main(String[] args) {
		One o = new One();
		Two t = new Two();
		o.start();
		t.start();
	}

}
