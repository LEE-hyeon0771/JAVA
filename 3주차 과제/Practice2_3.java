package practice;
import java.util.Scanner;
public class Practice2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 operator(+, -, *, / ,%) 정수2 입력(예: 2 + 3): ");
		int num1 = sc.nextInt();
		String op = sc.next();
		int num2 = sc.nextInt();
		int num3;
		switch(op) {
		case "+":
			num3 = num1 + num2;
			System.out.println(num3);
			break;
		case "-":
			num3 = num1 - num2;
			System.out.println(num3);
			break;
		case "*":
			num3 = num1 * num2;
			System.out.println(num3);
			break;
		case "/":
			num3 = num1 / num2;
			System.out.println(num3);
			break;
		case "%":
			num3 = num1 % num2;
			System.out.println(num3);
			break;
		default:
			System.out.println("Wrong Input");
		}
		
	}

}
