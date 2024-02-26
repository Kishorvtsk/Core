import java.util.Scanner;
class StarPatternThread extends Thread {
    private int lines;

    public StarPatternThread(int lines) {
        this.lines = lines;
    }

    @Override
    public void run() {
        for (int i = lines; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                try {
                    Thread.sleep(1000); // Delay of 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }
}

 public class StartThread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of line to print");
		int line = sc.nextInt();
		sc.close();
		StarPatternThread gun = new StarPatternThread(line);
		gun.start();

	}
 }
