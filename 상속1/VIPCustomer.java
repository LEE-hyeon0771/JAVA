package inheritance;

public class VIPCustomer extends Customer{  //상속을 받게 되면 상위 Customer클래스의 기능을 모두 사용할 수 있음
	
	private double saleRatio;
	private int agentID;
	
	public VIPCustomer()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	
	}
	public int getAgentID() {
		return agentID;
	}
}