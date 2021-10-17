package prgrammingpractice04again;

public class ex1 {

	public static void main(String[] args) {
		int i;
		int count = 0;
		for(i = 1; i<= 100; i++) {
			if(i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 !=0) {
				System.out.printf("%d ",i);
				count++;
				if(count%10 == 0) {
					System.out.println();
				}
			}
		}
	}

}
