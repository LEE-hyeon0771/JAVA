package programmingpractice;

public class ComputerTest {

	public static void main(String[] args) {
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		
		pc.print();
		System.out.println();
		apple.print();
		System.out.println();
		galaxy.print();
		System.out.println();
	}

}
