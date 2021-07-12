package practice6;

public class BeanCoffee {
	
	int money;
		
		public String purchasing(int money) {
			this.money += money;
			if(money == Menu.BeanAmericano) {
				return "콩 다방 아메리카노를 구입했습니다.";
			}
			else if(money == Menu.BeanLatte) {
				return "콩 다방 라떼를 구입했습니다.";
			}
			else {
				return null;
			}
		}
}
