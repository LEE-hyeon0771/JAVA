package witharraylist;

public class VIPCustomer extends Customer{  //����� �ް� �Ǹ� ���� CustomerŬ������ ����� ��� ����� �� ����
	
	
	private double saleRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID)
	{
		super(customerID, customerName);   //���� class�� ����Ʈ �����ڸ� ȣ���ϹǷ� ����Ʈ �����ڰ� ������ ���� 
		customerGrade = "VIP";   //����Ʈ �����ڰ� ������, super�� ������ ���ַ��� ���� Ŭ���� constructor�� �Ű������� super���� �޾��־����
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ���̵��" + agentID + "�Դϴ�";
	}
	public int getAgentID() {
		return agentID;
	}
}