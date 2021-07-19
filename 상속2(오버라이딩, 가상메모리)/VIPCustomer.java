package inheritance;

public class VIPCustomer extends Customer{  //상속을 받게 되면 상위 Customer클래스의 기능을 모두 사용할 수 있음
	
	private double saleRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID)
	{
		super(customerID, customerName);   //상위 class의 디폴트 생성자를 호출하므로 디폴트 생성자가 없으면 오류 
		customerGrade = "VIP";   //디폴트 생성자가 없을때, super의 오류를 없애려면 상위 클래스 constructor의 매개변수를 super에서 받아주어야함
		bonusRatio = 0.05;
		saleRatio = 0.1;
	
	}
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}
	public int getAgentID() {
		return agentID;
	}
}