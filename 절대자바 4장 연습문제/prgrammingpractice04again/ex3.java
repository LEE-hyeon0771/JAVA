package prgrammingpractice04again;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		int finalnum;
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݴ�� ����� �� �Է�: ");
		value = sc.nextInt();
		System.out.print("�ݴ�� ����� ��: ");
		
		do {
			finalnum = value % 10;
			value = value/10;
			System.out.printf("%d",finalnum);
		}
		while(value != 0);
	}

}
