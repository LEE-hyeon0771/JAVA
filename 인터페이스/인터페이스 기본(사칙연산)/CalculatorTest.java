package Interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();   //Ÿ�� ����� ���� ��
		//Calc calc1 = new Calc();    -> �������̽��� new �� �� ����
		//Calc calc2 = new Calculator();  -> implements �� �͵� new �� �� ���� 
		CompleteCalc calc1 = new CompleteCalc(); //����
		Calculator calc2 = new CompleteCalc();   //Calculator�� class ���̹Ƿ� �տ� ���� ����
		calc1.showInfo();
		//calc.showInfo(); -> Calc�� ����Ǿ� �־ Ŭ������ �ش� �������̽������� �� ��ȯ�� �̷������ 
		                      //�̶� ��� �� �� �ִ� �޼���� �������̽����� �޼��� ����.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.square(num1));
	}

}
