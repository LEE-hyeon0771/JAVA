package practice;
import java.util.Scanner;
public class Practice2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� 3���� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max = num1;
		if(num2 > max) {
			max = num2;
		}
		if(num3 > max) {
			max = num3;
		}
		int min = num1;
		if(num2 < min) {
			min = num2;
		}
		if(num3 < min) {
			min = num3;
		}
		
		System.out.println("�ִ밪�� " + max + ", " + "�ּҰ��� " + min);
		
		
	}

}
