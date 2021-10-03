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
		System.out.printf("%d일차 달팽이가 이동한 높이: %d\n",count,snail);
		if(snail >= height) {
			System.out.printf("%d회 만에 우물을 탈출하였습니다.",count);
			break;
		}
		}
	}

}
