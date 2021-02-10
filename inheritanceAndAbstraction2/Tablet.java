package inheritanceAndAbstraction2;

public class Tablet extends Medicine {
	
	

	public Tablet(double price, String expirydate) {
		super(price, expirydate);
	}

	@Override
	void displayLabel() {
		System.out.println("Store it in a cool dry place");
		
	}

}
