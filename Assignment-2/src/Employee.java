import java.util.Scanner;

public class Employee extends GroceryStore { // inheritance
	private String name, gender, address, phoneNum;
	private int age;
	Scanner scan = new Scanner(System.in); // Pre-Defined Class

	Employee() { // Constructor with no argument
		super();
		System.out.println("\nRegistering Employee info...");
		System.out.print("Enter name\t\t: ");
		this.name = scan.next() + scan.nextLine();
		System.out.print("Enter age\t\t: ");
		this.age = scan.nextInt();
		System.out.print("Enter gender\t\t: ");
		this.gender = scan.next() + scan.nextLine();
		System.out.print("Enter phone number\t: ");
		this.phoneNum = scan.next() + scan.nextLine();
		System.out.print("Enter address\t\t: ");
		this.address = scan.next() + scan.nextLine();
	}

	public void printInfo() {// polymorphism
		System.out.println("Registered successfully, displaying employee info...");
		System.out.println("====================================================");
		System.out.println("Employer\t: " + storeName);
		System.out.println("Employee Name\t: " + this.name);
		System.out.println("Age\t\t: " + this.age);
		System.out.println("Gender\t\t: " + this.gender);
		System.out.println("Phone Number\t: " + this.phoneNum);
		System.out.println("Home Address\t: " + this.address);
		System.out.println("====================================================");
	}
}
