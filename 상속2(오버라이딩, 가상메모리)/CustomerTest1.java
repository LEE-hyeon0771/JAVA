package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10100,"Lee");
		//customerLee.setCustomerID(10100);
		//customerLee.setCustomerName("Lee");
		customerLee.setBonusPoint(1000);
		
		Customer customerKim = new VIPCustomer(10101, "Kim",100);  //묵시적 형변환(업퀘스팅)
		//customerKim.setCustomerID(10101);
		//customerKim.setCustomerName("Kim");
		customerKim.setBonusPoint(10000);
		
		customerLee.showCustomerInfo();
		customerKim.showCustomerInfo();
		
	}

}
