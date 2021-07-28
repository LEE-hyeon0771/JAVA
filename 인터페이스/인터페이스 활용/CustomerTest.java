package Interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.order();       //모두 customer로 위에서 지정했으므로, buyer,seller역시 customer의 재정의된 메서드가 출력됨.
		buyer.order();
		seller.order();
	}

}
