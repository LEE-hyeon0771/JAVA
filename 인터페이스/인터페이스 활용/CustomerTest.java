package Interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.order();       //��� customer�� ������ ���������Ƿ�, buyer,seller���� customer�� �����ǵ� �޼��尡 ��µ�.
		buyer.order();
		seller.order();
	}

}
