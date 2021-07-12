package practice6;

public class Card {
	
	private static int serialNum = 1000;
	
	private int CardNum;
	
	Card(){
		serialNum++;
		CardNum = serialNum;
	}

	public int getCardNum() {
		return CardNum;
	}
}
