
public class Sales extends Customer { // inheritance
	private String productName, deliveryMode;
	private double price, deliveryCost, distance;
	private int quantity;

	Sales() { // constructor with no argument
		super();
		System.out.println("Please select your purchase: ");
		System.out.println("1. Frozen Pizza");
		System.out.println("2. Fish Fillet");
		System.out.println("3. Sausage");
		System.out.print("Enter your purchase: ");
		int purchase = scan.nextInt();
		System.out.print("Enter quantity\t   : ");
		quantity = scan.nextInt();
		switch (purchase) {
		case 1:
			productName = "Frozen Pizza";
			price = 12.0;
			break;
		case 2:
			productName = "Fish Fillets";
			price = 4.0;
			break;
		case 3:
			productName = "Sausage";
			price = 7.0;
			break;
		default:
			System.out.println("Product not found! Please enter a valid product name!");
		}
		printInfo(name);
	}

	public void Delivery(int mode, double distance) { // constructor with 2 argument
		this.distance = distance;
		if (mode == 1) {
			deliveryMode = "Face to face";
			deliveryCost = 1.2;
		} else if (mode == 2) {
			deliveryMode = "Parcel Shipping";
			deliveryCost = 0.8;
		}
	}

	public double calDeliveryFee() {
		return deliveryCost * distance;
	}

	public double calTotalPrice() { 
		Payment a = new calSales();
		return a.getPayment(price, quantity);
	}

	public void printInfo(String name) { // polymorphism
		System.out.println("\nDear " + name + ",");
		System.out.println("======================Your Purchase======================");
		System.out.println("Product name\t: " + this.productName);
		System.out.printf("Unit Price\t: RM%.2f%n", this.price);
		System.out.println("Quantity\t: " + this.quantity);
		System.out.printf("Total price\t: RM%.2f%n", calTotalPrice());
		System.out.println("==============Thank you, please come again!==============");
	}

	public void printDelivery() {
		System.out.println("=======================================");
		System.out.println("Delivery mode\t\t: " + this.deliveryMode);
		System.out.printf("Cost of delivery(per km): RM%.2f%n", this.deliveryCost);
		System.out.println("Distance(in km)\t\t: " + this.distance + "km");
		System.out.printf("Delivery Fee\t\t: RM%.2f%n", calDeliveryFee());
		System.out.printf("Total Price(Include Delivery): RM%.2f%n", (calDeliveryFee() + calTotalPrice()));
		System.out.println("=======================================");
	}
}
