class Account{
	int accno;
	String name;
	float balance;
	
	public void display() {
		System.out.println("The name of customer is :" +name);
		System.out.println("And account number is :" +accno);
		System.out.println("balnce amount is :" +balance);
	}
	
	public void deposite() {
		balance+=balance;
	}
}
public class BankAccount {

	public static void main(String[] args) {
		
	}

}
