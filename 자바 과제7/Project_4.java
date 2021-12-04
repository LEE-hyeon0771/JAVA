package homework_7;
import java.util.Calendar;
import java.util.Scanner;
public class Project_4 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String d;
	System.out.println("연도를 입력하시오 : ");
	int year = input.nextInt();
	System.out.println("월을 입력하시오 : ");
	int month = input.nextInt();
	System.out.println("일을 입력하시오 : ");
	int date = input.nextInt();
	
	Calendar now = Calendar.getInstance();
	now.set(Calendar.YEAR, year);
	now.set(Calendar.MONTH, month-1);
	now.set(Calendar.DATE, date);
	int dayofWeek = now.get(Calendar.DAY_OF_WEEK);
	switch(dayofWeek) {
	case 1:
		d="일요일";
		break;
	case 2:
		d="월요일";
		break;
	case 3:
		d="화요일";
		break;
	case 4:
		d="수요일";
		break;
	case 5:
		d="목요일";
		break;
	case 6:
		d="금요일";
		break;
	default:
		d="토요일";
		break;
	
	}
	System.out.println(d);
	}
	
}
