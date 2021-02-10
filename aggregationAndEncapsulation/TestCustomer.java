package aggregationAndEncapsulation;

public class TestCustomer {

	public static void main(String[] args) {
			Address ad=new Address(" Ist Main HSR Layout","Bangalore");
			Customer c1=new Customer("John",ad);
			
			String s=c1.getCustomerDetails();
			System.out.println(s);
			
			
	}

}
