package prgrammingpractice04again;

public class ex6 {

	public static void main(String[] args) {
		
		double F;
		double C;
		
		for(C=-60;C<=140;C+=20) {
			F = (9.0/5.0)*C + 32;
			System.out.printf("ȭ���µ�(F): %d%n",(int)F);
		}
	}

}
