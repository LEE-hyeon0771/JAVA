package programmingpractice;

public class Computer {
	public static final String[] osType = {"����7", "���� OS X", "�ȵ���̵�"};
	public int mainMemory;
	private int OS;
	public Computer(int OS, int mainMemory) {
		this.mainMemory = mainMemory;
		this.OS = OS;
	}
	
	
	public int getOS() {
		return OS;
	}


	public void setOS(int OS) {
		this.OS = OS;
	}


	public void print() {
		System.out.printf("�ü��: %s, ���θ޸�: %d", osType[OS], mainMemory);
		
	}
}
