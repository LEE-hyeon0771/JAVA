package ifloopAlone;

public class Practice1 {

	public static void main(String[] args) {
		
		System.out.println("<< ��Ģ���� ���α׷� >>");
		int num1 =10;
		int num2 =2;
		char operator = '+';
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
		}
		else if(operator == '*') {
			result = num1 * num2;
		}
		else if(operator == '/') {
			result = num1 / num2;
		}
		System.out.println("��� ���� " + result + "�Դϴ�.");
		
		char operator1 = '*';
		int result1 = 0;
		
		switch(operator1) {
		case '+':
			result1 = num1 + num2;
			break;
		case '-':
			result1 = num1 - num2;
			break;
		case '*':
			result1 = num1 * num2;
			break;
		case '/':
			result1 = num1 / num2;
			break;
		default:
			break;
		}
		System.out.println("��� ���� " + result1 + "�Դϴ�.");
	

	}
	

}
