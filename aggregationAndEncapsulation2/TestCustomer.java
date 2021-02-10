package aggregationAndEncapsulation2;

public class TestCustomer {

	public static void main(String[] args) {
			Address ad=new Address(" Ist Main HSR Layout","Bangalore");
			Address ad1=new Address(" Ist Main Electronics city","Bangalore");
			Customer c1=new Customer("John",ad,ad1);
			
			String s=c1.getCustomerDetails();
			System.out.println(s);
				
	}

}
