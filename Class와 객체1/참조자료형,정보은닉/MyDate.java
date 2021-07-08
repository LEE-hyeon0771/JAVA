package practice;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public int getDay() {      //Day �� �ҷ���
		return day;
	}
	public void setDay(int day) {    //Day�� ��ȿ���� ����
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day<1 || day>31) {
				isValid = false;
			}
			else {
				this.day = day;
			}
			break;
		case 2:
			if(((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0)) {
				if(day<1 || day > 29) {
					isValid = false;
				}
				else {
					this.day = day;
				}
			
			}
			else {
				if(day <1 || day > 28) {
					isValid = false;
				}
				else {
					this.day = day;
				}
			}
			break;
		case 4: case 6: case 9: case 11:
			if(day<1 || day > 30) {
				isValid = false;
			}
			else {
				this.day = day;
			}
			break;
		default:
			isValid = true;
		}
}
	public int getMonth() {      //Month�� ���� �ҷ���
		return month;
	}
	public void setMonth(int month) {      //Month�� ��ȿ���� ����
		if(month < 1 || month > 12) {
			isValid = false;
		}
		else {
		this.month = month;
		}
	}
	public int getYear() {      //Year�� ���� �ҷ���
		return year;
	}
	public void setYear(int year) {       //Year�� ��ȿ���� ����
		if(year < 1) {
			isValid = false;
		}
		else {
		this.year = year;
		}
	}
	
	public MyDate(int day, int month, int year) {      //public���� MyDate������ ����
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public String isValid() {
		if(isValid) {
			return "��ȿ�� ��¥�Դϴ�.";
			}
		else {
			return "��ȿ���� ���� ��¥�Դϴ�.";
			}
		}
	}
	
	

