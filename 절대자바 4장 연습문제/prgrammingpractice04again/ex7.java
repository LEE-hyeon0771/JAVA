package prgrammingpractice04again;

public class ex7 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int n;
		while(sum<5000) {
			sum += ++i;
		}
		System.out.printf("가장 큰 합: %d, 그 때의 n은 %d",sum-i,i-1);
		
	}
	
}
