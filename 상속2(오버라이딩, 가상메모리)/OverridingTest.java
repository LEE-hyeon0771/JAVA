package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
	/*	Customer customerLee = new Customer(100010, "LEE");
		customerLee.calcPrice(10000);
		customerLee.showCustomerInfo();
		
		VIPCustomer customerKim = new VIPCustomer(100010, "Kim", 100);
		customerKim.calcPrice(10000);
		customerKim.showCustomerInfo();*/
		
		Customer customerWho = new VIPCustomer(100010, "Who", 100);   //������ �Ǹ� �ν��Ͻ��� �Ҹ���.(����޼���)
		int price = customerWho.calcPrice(10000);
		customerWho.showCustomerInfo();
	}

}
