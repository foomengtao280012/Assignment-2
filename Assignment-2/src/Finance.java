
public class Finance extends Inventory {//inheritance
	double totalIncome, insurance, rent, adCost;

	Finance(double totalIncome) {//constructor with 1 argument
		super();
		this.totalIncome = totalIncome;
		this.setInsurance(2500);
		this.setRent(3000);
		this.setAdCost(500);
	}
	
	public void setInsurance(double insurance) {//encapsulation
		this.insurance = insurance;
	}
	
	public void setRent(double rent) {
		this.rent = rent;
	}
	
	public void setAdCost(double adCost) {
		this.adCost = adCost;
	}
	
	public double getInsurance() {
		return this.insurance;
	}
	
	public double getRent() {
		return this.rent;
	}
	
	public double getAdCost() {
		return this.adCost;
	}

	public double calTotalCost() {
		return insurance + rent + calInventoryCost() + adCost;
	}

	public double calNetIncome() {
		Payment a = new calFinance();
		return a.getPayment(totalIncome, calTotalCost());
	}

	public void printInfo() {
		System.out.println("\n===============Financial Report for Fresh Mart===============");
		System.out.printf("Total income of the store for this month\t: RM%.2f%n", this.totalIncome);
		System.out.printf("Total expenses of the store for this month\t: RM%.2f%n", calTotalCost());
		System.out.printf("Net income of the store for this month\t\t: RM%.2f%n", calNetIncome());
		System.out.println("=============================================================");
	}
}
