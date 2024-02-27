import java.util.Scanner;

public class Voter {
    private String voterId;
    private String name;
    private int age;

    public Voter(String voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
    public void display() {
    	System.out.println("The Id of voter is "+voterId);
    	System.out.println("Voter name  is "+name);
    	System.out.println("Age of the voter is " +age);
    }

    // Other methods and fields can go here

    public static void main(String[] args) {
        try {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter name , id , age");
        	String voterId=sc.next();
        	String name = sc.next();
        	int age = sc.nextInt();
        	  try {
                  Voter voter = new Voter(voterId,name,age); // This will throw an exception
              } catch (InvalidAgeException e) {
                  System.out.println(e.getMessage());
              }

        	
            Voter voter = new Voter(voterId,name,age); // This will not throw an exception
            System.out.println("Voter created successfully!");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
