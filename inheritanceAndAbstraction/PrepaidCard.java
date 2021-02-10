package inheritanceAndAbstraction;

public abstract class PrepaidCard {
	int CardNo;
	double availableBalance; 
	double swipeLimit;
	
	

	public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
		super();
		CardNo = cardNo;
		this.availableBalance = availableBalance;
		this.swipeLimit = swipeLimit;
	}

	public boolean swipeCard(int amount) {
		if(availableBalance>=amount && amount<=swipeLimit) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	public void  rechargeCard(int amount) {
		availableBalance+=amount;
	}

	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	
	

}
