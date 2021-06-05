
class calSales implements Payment {

	public double getPayment(double price, double quantity) {
		return price * quantity;
	}
}

class calFinance implements Payment {

	public double getPayment(double income, double expenses) {
		return income - expenses;
	}

}
