package inheritanceAndAbstraction2;

public class Syrup extends Medicine{

	public Syrup(double price, String expirydate) {
		super(price, expirydate);
		
	}

	@Override
	void displayLabel() {
		System.out.println("Shake well before use");
		
	}

}
