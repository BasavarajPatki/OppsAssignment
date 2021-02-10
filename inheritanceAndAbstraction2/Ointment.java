package inheritanceAndAbstraction2;

public class Ointment extends Medicine {

	public Ointment(double price, String expirydate) {
		super(price, expirydate);
	}

	@Override
	void displayLabel() {
		System.out.println("For external use only");
		
	}

}
