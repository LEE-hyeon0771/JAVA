package practice3;

public class Practice3_3 {

	public static void main(String[] args) {
		int snail = 0;
		int count = 0;
		int height = 100;
		while(true) {
		if(snail > 50) {
			snail += 4;
		}
		else {
			snail += 5;
		}
		if(snail > 50) {
			snail -= 2;
		}
		else {
			snail -= 1;
		}
		
		count++;
		System.out.printf("%d���� �����̰� �̵��� ����: %d\n",count,snail);
		if(snail >= height) {
			System.out.printf("%dȸ ���� �칰�� Ż���Ͽ����ϴ�.",count);
			break;
		}
		}
	}

}
