package prgrammingpractice04again;

public class ex5 {

	public static void main(String[] args) {
		int origin = 1000000;
		double total = 0;
		double rate = 0.045;
		double year = 0;
		for(int i = 0; i<=10; i++) {
			year = origin * rate * i;
			total = origin * (1 + rate * i);
		}
		System.out.printf("연단위 연리이자는 %f이고 만기 시 총 수령액은 %f이다.",year,total);
	}
}
