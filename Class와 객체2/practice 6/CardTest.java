package practice6;

public class CardTest {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		Card first = company.createCard();
		Card second = company.createCard();
		
		System.out.println("ù��° ī���� ���ڴ� " + first.getCardNum() + "�Դϴ�.");
		System.out.println("�ι�° ī���� ���ڴ� " + second.getCardNum() + "�Դϴ�.");
	}

}
