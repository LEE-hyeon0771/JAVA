package practice6;

public class BeanCoffee {
	
	int money;
		
		public String purchasing(int money) {
			this.money += money;
			if(money == Menu.BeanAmericano) {
				return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
			}
			else if(money == Menu.BeanLatte) {
				return "�� �ٹ� �󶼸� �����߽��ϴ�.";
			}
			else {
				return null;
			}
		}
}
