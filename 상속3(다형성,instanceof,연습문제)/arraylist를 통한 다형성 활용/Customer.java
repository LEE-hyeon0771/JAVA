package witharraylist;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;    //protected는 private역할을 하지만 상속관계에서는 public처럼 보인다.
	int bonusPoint;
	double bonusRatio;
	
	
	/*public Customer()               //디폴트 생성자
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	
	}*/
	
	public Customer(int customerID, String customerName){         //고객의 ID와 이름을 반드시 지정해야할때
		this.customerID = customerID;                             //매개변수를 추가하여 다시 constructor생성
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	
	}
	
	public int calcPrice(int price){
		
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo(){
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";  
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
