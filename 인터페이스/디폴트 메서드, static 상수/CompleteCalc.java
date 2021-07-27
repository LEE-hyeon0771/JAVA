package Interfaceex;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
		return num1 / num2;
	}
		return ERROR;
	}
	
	@Override
	public void description() {
		System.out.println("완벽한 계산기 입니다.");    //인터페이스에 구현한 것을 클래스에서 재정의 할 수 있음.
		
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public int square(int num) {
		return num * num;
	}

}
