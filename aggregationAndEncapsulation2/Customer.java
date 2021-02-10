package aggregationAndEncapsulation2;

public class Customer {
	
	private String customerName;
	private Address  residentialAddress;
	Address officialAddress;
	
	

	public Customer(String customerName, Address residentialAddress, Address officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
	}



	/*
	 * public String getCustomerName() { return customerName; } public void
	 * setCustomerName(String customerName) { this.customerName = customerName; }
	 * public Address getResidentialAddress() { return residentialAddress; } public
	 * void setResidentialAddress(Address residentialAddress) {
	 * this.residentialAddress = residentialAddress; }
	 */
	public String getCustomerDetails() {
		return "Customer : "+customerName+"\n"+"Address : "+residentialAddress.getaddressdetails()+"\n"+"Official Address : "+officialAddress.getaddressdetails();
	}
	
	

}
