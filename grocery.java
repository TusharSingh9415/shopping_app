package classes;

public class grocery {
	private String customername;
	private String customerId;
	private String customerphone;
	private double accbal;
	private String Address;

public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

public void shop(double amount)
{
	if(accbal>=amount)
	{
	double rembal=accbal-amount;
	System.out.println("Thanks for shopping. Your remaining balance "+rembal);
	accbal=rembal;
	}
	else
	{
		double rem=amount-accbal;
		System.out.println("Insufficent balance. Amount required "+rem);
	}
}

public void recharge(double amt)
{
	accbal=accbal+amt;
	System.out.println("Sucessfully recharged of "+amt+"  Current balance "+accbal);
}



}
