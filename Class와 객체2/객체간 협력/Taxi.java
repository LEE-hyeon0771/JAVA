package cooperation;

public class Taxi {
	int money;
	int taxinum;
	
	public Taxi(int taxinum) {
		this.taxinum = taxinum;
	}
	
	public void take(int money) {
		this.money = money;
	}
	public void showInfo() {
		System.out.println("택시" + taxinum + "번의 수입은" + money + "입니다.");
	}
}
