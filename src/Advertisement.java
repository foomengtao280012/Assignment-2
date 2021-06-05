
public class Advertisement extends GroceryStore { // inheritance

	Advertisement() {
		super();
	}

	public void printInfo() { // polymorphism
		System.out.println("\n*********************************************************");
		System.out.println("Welcome to " + storeName + "! The newest grocery store in Klang!");
		System.out.println("The cheapest price you can find in town!");
		System.out.println("You can find everything you'll ever need here!");
		System.out.println("Contact us at " + phoneNum + " now!");
		System.out.println("*********************************************************");
	}
}
