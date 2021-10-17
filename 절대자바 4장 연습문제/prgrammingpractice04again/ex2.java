package prgrammingpractice04again;

public class ex2 {

	public static void main(String[] args) {
		int i,j;
		
		for(i=0;i<=7;i++) {
			for(j=7;j>=-7;j--) {
				if(j>i || j<-i) {
					System.out.print(" ");
				}
				else {
					System.out.printf("%d",Math.abs(j));
				}
			}
			System.out.println();
		}
	}

}
