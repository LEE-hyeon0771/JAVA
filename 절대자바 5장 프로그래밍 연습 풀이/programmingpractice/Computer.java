package programmingpractice;

public class Computer {
	public static final String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
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
		System.out.printf("운영체제: %s, 메인메모리: %d", osType[OS], mainMemory);
		
	}
}
