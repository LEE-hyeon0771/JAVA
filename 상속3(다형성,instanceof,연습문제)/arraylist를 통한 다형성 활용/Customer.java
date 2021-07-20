package witharraylist;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;    //protected�� private������ ������ ��Ӱ��迡���� publicó�� ���δ�.
	int bonusPoint;
	double bonusRatio;
	
	
	/*public Customer()               //����Ʈ ������
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	
	}*/
	
	public Customer(int customerID, String customerName){         //���� ID�� �̸��� �ݵ�� �����ؾ��Ҷ�
		this.customerID = customerID;                             //�Ű������� �߰��Ͽ� �ٽ� constructor����
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	
	}
	
	public int calcPrice(int price){
		
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo(){
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";  
	}

	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
}
