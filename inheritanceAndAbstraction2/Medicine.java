package inheritanceAndAbstraction2;

public abstract class Medicine {
	double price;
	String expirydate;
	public Medicine(double price, String expirydate) {
		super();
		this.price = price;
		this.expirydate = expirydate;
	}
	
	public void getdetails() {
		System.out.println("Price : "+price);
		System.out.println("Exmpiry Date : "+expirydate);
	}
	abstract void displayLabel();

}
