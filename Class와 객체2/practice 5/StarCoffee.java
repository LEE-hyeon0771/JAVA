package practice6;

public class StarCoffee {
	
	int money;
	
	public String purchasing(int money) {
		this.money += money;
		if(money == Menu.StarAmericano) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}
		else if(money == Menu.StarLatte) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�.";
		}
		else {
			return null;
		}
	}
}
