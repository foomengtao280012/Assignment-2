
public class Inventory{
	private String[] productName = { "Frozen Pizza", "Fish Fillet", "Sausage" };
	private double[] price = { 12.0, 4.0, 7.0 };
	private int[] quantity = { 67, 151, 96 };
	
	public double calInventoryCost() {
		double inventory = 0;
		for (int i = 0; i < 3; i++) {
			inventory += price[i] * quantity[i];
		}
		return inventory;
	}

	public void printInfo() {
		System.out.println("Inventory info");
		for (int i = 0; i < 3; i++) {
			System.out.println("***********************************************");
			System.out.println("Product name\t\t\t: " + productName[i]);
			System.out.printf("Price of the product\t\t: RM%.2f%n", price[i]);
			System.out.println("Quantity left in inventory\t: " + quantity[i]);
		}
		System.out.println("***********************************************");
	}
}
