package homework_7;
import java.util.Calendar;
import java.util.Scanner;
public class Project_4 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String d;
	System.out.println("������ �Է��Ͻÿ� : ");
	int year = input.nextInt();
	System.out.println("���� �Է��Ͻÿ� : ");
	int month = input.nextInt();
	System.out.println("���� �Է��Ͻÿ� : ");
	int date = input.nextInt();
	
	Calendar now = Calendar.getInstance();
	now.set(Calendar.YEAR, year);
	now.set(Calendar.MONTH, month-1);
	now.set(Calendar.DATE, date);
	int dayofWeek = now.get(Calendar.DAY_OF_WEEK);
	switch(dayofWeek) {
	case 1:
		d="�Ͽ���";
		break;
	case 2:
		d="������";
		break;
	case 3:
		d="ȭ����";
		break;
	case 4:
		d="������";
		break;
	case 5:
		d="�����";
		break;
	case 6:
		d="�ݿ���";
		break;
	default:
		d="�����";
		break;
	
	}
	System.out.println(d);
	}
	
}
