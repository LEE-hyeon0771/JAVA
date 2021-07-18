package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		customerLee.setBonusPoint(1000);
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kim");
		customerKim.setBonusPoint(10000);
		
		customerLee.showCustomerInfo();
		customerKim.showCustomerInfo();
		
	}

}
