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
		System.out.println("�Ϻ��� ���� �Դϴ�.");    //�������̽��� ������ ���� Ŭ�������� ������ �� �� ����.
		
	}

	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}

	@Override
	public int square(int num) {
		return num * num;
	}

}
