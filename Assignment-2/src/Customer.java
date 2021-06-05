import java.util.Scanner;

public abstract class Customer{
	protected String name;
	private String phoneNum;
	private String address;
	Scanner scan = new Scanner(System.in); // pre-Defined Class

	Customer() { // Constructor with no argument
		System.out.println("=========================================================");
		System.out.println("Please enter your details...");
		System.out.print("Enter name\t\t: ");
		this.name = scan.next() + scan.nextLine();
		System.out.print("Enter phone number\t: ");
		this.phoneNum = scan.next() + scan.nextLine();
		System.out.print("Enter address\t\t: ");
		this.address = scan.next() + scan.nextLine();
		System.out.println("=========================================================");
		printInfo();
	}

	public void printInfo() {//polymorphism
		System.out.println("Registered successfully, displaying customer info...");
		System.out.println("=========================================================");
		System.out.println("Customer Name\t: " + this.name);
		System.out.println("Phone Number\t: " + this.phoneNum);
		System.out.println("Home Address\t: " + this.address);
		System.out.println("=========================================================");
	}
}
