package practice;
import java.util.Scanner;

public class Practice2_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int year = sc.nextInt();
		String animal;
		switch(year % 12) {
			case 0:
				animal = "������";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			case 1:
				animal = "��";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			case 2:
				animal = "��";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			case 3:
				animal = "����";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			case 4:
				animal = "��";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			case 5:
				animal = "��";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			case 6:
				animal = "ȣ����";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			case 7:
				animal = "�䳢";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			case 8:
				animal = "��";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			case 9:
				animal = "��";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			case 10:
				animal = "��";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			case 11:
				animal = "��";
				System.out.println(year + "���� " + animal + "�� ���Դϴ�.");
				break;
			default:
			
			
		}
		
	}
}
