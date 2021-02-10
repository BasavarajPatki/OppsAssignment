package inheritanceAndAbstraction;

public class TravelCard extends PrepaidCard implements Rewardable{
	
	
	public TravelCard(int cardNo, double availableBalance, double swipeLimit) {
		super(cardNo, availableBalance, swipeLimit);
		
		
	}

	float rewardPoints=0;
	
	@Override
	public void totalrewardpoints(int amount) {
		rewardPoints+=amount/20;
		
	}
	
	void swipe(int amount) {
		if(swipeCard(amount)) {
			availableBalance=availableBalance-amount-(amount*5/100);
			System.out.println("Available Balance : "+availableBalance);
			totalrewardpoints(amount);
			System.out.println("Total reward points are : "+ rewardPoints);
		}
		else {
			System.out.println("Enter valid amount");
		}
	}

}
