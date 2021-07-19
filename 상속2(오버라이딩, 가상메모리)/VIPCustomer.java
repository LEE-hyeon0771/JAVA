package inheritance;

public class VIPCustomer extends Customer{  //����� �ް� �Ǹ� ���� CustomerŬ������ ����� ��� ����� �� ����
	
	private double saleRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID)
	{
		super(customerID, customerName);   //���� class�� ����Ʈ �����ڸ� ȣ���ϹǷ� ����Ʈ �����ڰ� ������ ���� 
		customerGrade = "VIP";   //����Ʈ �����ڰ� ������, super�� ������ ���ַ��� ���� Ŭ���� constructor�� �Ű������� super���� �޾��־����
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