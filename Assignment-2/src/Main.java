import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in); // pre-defined class

	public static void main(String[] args) {
		System.out.println("*****************************************");
		System.out.println("Store name\t: Fresh Mart");
		System.out.println("Phone number\t: 03-32917028");
		System.out.println("Address\t\t: 87, Jalan Meru 12," + "\n\t\t  Taman Gembira," + "\n\t\t  41050 Klang, Selangor.");
		System.out.println("Business hour\t: 10am to 8pm");
		System.out.println("*****************************************");
		char cont;
		do {
			System.out.println("Choose your option: ");
			System.out.println("1. Admin");
			System.out.println("2. Customer");
			System.out.print("Enter option: ");
			int option = scan.nextInt();
			if (option == 1) {
				System.out.println("*****************************************");
				System.out.println("Welcome admin.");
				char choice;
				do {
					System.out.println("Choose your operation: ");
					System.out.println("1. View Financial Report");
					System.out.println("2. Register Employee Details");
					System.out.println("3. View Inventory Info");
					System.out.print("Enter operation: ");
					int operation = scan.nextInt();
					if (operation == 1) {
						Finance f = new Finance(12000.0);// constructor with 1 arguments
						f.printInfo();
					} else if (operation == 2) {
						Employee employee = new Employee();// constructor with no argument
						employee.printInfo();
					} else if (operation == 3) {
						Inventory i = new Inventory();// constructor with no argument
						i.printInfo();
					} else {
						System.out.println("Error! Please select a valid operation!");
					}
					System.out.print("Do you want to perform another operation(Y/N)? ");
					choice = scan.next().charAt(0);
				} while (choice == 'Y' || choice == 'y');
			} else if (option == 2) {
				Advertisement ad = new Advertisement();// constructor with no argument
				ad.printInfo();
				Sales sales = new Sales();// constructor with no argument
				System.out.print("\nDo you need a delivery service?(Y/N): ");
				char choice = scan.next().charAt(0);
				if (choice == 'Y' || choice == 'y') {
					System.out.println("Choose your delivery mode: ");
					System.out.println("1. Face to face");
					System.out.println("2. Parcel shipping");
					System.out.print("Enter option\t\t: ");
					int mode = scan.nextInt();
					System.out.print("Enter distance(in km)\t: ");
					double distance = scan.nextDouble();
					sales.Delivery(mode, distance);// constructor with 2 arguments
					sales.printDelivery();
				} else {
					System.out.println("Thank you for your purchase!");
				}
			}
			System.out.print("Do you want to continue(Y/N)? ");
			cont = scan.next().charAt(0);
		} while (cont == 'Y' || cont == 'y');
	}
}
