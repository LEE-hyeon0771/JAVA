package prgrammingpractice04again;

public class ex4 {

	public static void main(String[] args) {
		double x; 
		double y;
		for(x=5; x<=10; x+=0.5) {
			y = 4*x*x*x + 5*x*x + x + 2;
			System.out.printf("x: %.2f, y: %.2f%n",x ,y);
		}
		
	}

}
