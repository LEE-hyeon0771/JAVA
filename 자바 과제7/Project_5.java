package homework_7;

import java.util.Calendar;

public class Project_5 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		String d;
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int date = now.get(Calendar.DATE);
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
		System.out.println("������ "+ year+"�� "+ month+"�� "+ date+"�� "+ d+" �Դϴ�.");
		System.out.println("�� ���� "+ now.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"��° "+d+" �Դϴ�.");
		System.out.println("�� ���� "+ now.get(Calendar.WEEK_OF_MONTH)+"��° ���Դϴ�.");
		System.out.println("�� ���� "+ now.get(Calendar.DAY_OF_YEAR)+"�� �Դϴ�.");
		System.out.println("�� ���� "+ now.get(Calendar.WEEK_OF_YEAR)+"��° �� �Դϴ�.");
	}

}
