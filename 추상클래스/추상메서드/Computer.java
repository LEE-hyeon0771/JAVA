package abstractex;

public abstract class Computer {
	
	public abstract void display();       //���� �ڵ尡 �����Ƿ� �߻� �޼��尡 ��
	public abstract void typing();           //�߻�Ŭ������ ����� ���� ����� Ŭ����
                                             //��� ���� Ŭ�������� ������.(���� Ŭ������ ������ ���ӽ��״�.)
	
	
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
