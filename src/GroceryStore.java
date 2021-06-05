
public abstract class GroceryStore {
	protected String storeName, phoneNum, address, businessHours;

	GroceryStore() {
		this.setStoreName("Fresh Mart");
		this.setPhoneNum("03-32917028");
		this.setAddress("87, Jalan Meru 12," + "\n\t\t  Taman Gembira," + "\n\t\t  41050 Klang, Selangor.");
		this.setBusinessHours("10am to 8pm");
	}

	public void printInfo() {
		System.out.println("*****************************************");
		System.out.println("Store name\t: " + this.getStoreName());
		System.out.println("Phone number\t: " + this.getPhoneNum());
		System.out.println("Address\t\t: " + this.getAddress());
		System.out.println("Business hour\t: " + this.getBusinessHours());
		System.out.println("*****************************************");
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	public String getStoreName() {
		return storeName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public String getBusinessHours() {
		return businessHours;
	}

}
