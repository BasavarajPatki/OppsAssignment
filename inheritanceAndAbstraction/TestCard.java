package inheritanceAndAbstraction;

public class TestCard {

	public static void main(String[] args) {
		TravelCard t1=new TravelCard(1234, 5000, 2000);
		
		t1.swipe(500);
		t1.rechargeCard(500);
		t1.swipe(100);

	}

}
