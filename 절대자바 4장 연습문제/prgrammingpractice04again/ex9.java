package prgrammingpractice04again;

public class ex9 {

	public static void main(String[] args) {
		int prime[] = new int[1001];
		int i;
		int j;
		for(i=1;i<=1000;i++) {
			prime[i] = 0;
		}
		for(i=2;i<=1000;i++) {
			prime[i] = 1;
		}
		//int Limit = (int)Math.sqrt(1000);
		for(i=2;i<=1000;i++) {
			for(j = i*2;j<=1000;j++) {
				if(j%i == 0) {
					prime[j] = 0;
				}
			}
		}
		for(i=2;i<=1000;i++) {
			if(prime[i] == 1) {
				System.out.printf("%d ",i);
			}
		}
	}

}
