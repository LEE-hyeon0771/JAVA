package practice6;

public class CardTest {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		Card first = company.createCard();
		Card second = company.createCard();
		
		System.out.println("첫번째 카드의 숫자는 " + first.getCardNum() + "입니다.");
		System.out.println("두번째 카드의 숫자는 " + second.getCardNum() + "입니다.");
	}

}
