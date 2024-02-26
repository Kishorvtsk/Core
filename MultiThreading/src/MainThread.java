class MyThread1 extends Thread {
	public void run() {
		System.out.println("My thread1 is running");
		System.out.println("I am kishor" +this.getPriority());
	}
}

class MyThread2 extends Thread {
	public void run() {
		System.out.println("My thread2 is running ");
		System.out.println("I am sonu" );
	}
}

public class MainThread {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}
