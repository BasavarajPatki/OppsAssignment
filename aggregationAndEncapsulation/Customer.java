package aggregationAndEncapsulation;

public class Customer {
	
	private String customerName;
	private Address  residentialAddress;
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}

	/*
	 * public String getCustomerName() { return customerName; } public void
	 * setCustomerName(String customerName) { this.customerName = customerName; }
	 * public Address getResidentialAddress() { return residentialAddress; } public
	 * void setResidentialAddress(Address residentialAddress) {
	 * this.residentialAddress = residentialAddress; }
	 */
	public String getCustomerDetails() {
		return "Customer : "+customerName+"\n"+"Address : "+residentialAddress.getaddressdetails();
	}
	
	

}
