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
		System.out.println("�ý�" + taxinum + "���� ������" + money + "�Դϴ�.");
	}
}
