import java.util.Scanner;
	public class PrimeNumber implements Runnable{
		private int number;

		public PrimeNumber(int number) {
			this.number = number;
		}

		public void run() {
			if (isPrime(number)) {
				System.out.println(number + " Prime number");
			} else {
				System.out.println(number + "not prime number");
			}
		}

		private boolean isPrime(int n) {
			if (n <= 1) {
	            return false;
	        }
	        if (n <= 3) {
	            return true;
	        }
	        if (n % 2 == 0 || n % 3 == 0) {
	            return false;
	        }
	        for (int i = 5; i * i <= n; i = i + 6) {
	            if (n % i == 0 || n % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }


		public static void main(String[] args) {
			PrimeNumber bullet = new PrimeNumber(7);
			Thread shoot = new Thread(bullet);
			shoot.start();
		}
	}

