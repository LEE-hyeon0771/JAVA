package practice;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public int getDay() {      //Day 를 불러옴
		return day;
	}
	public void setDay(int day) {    //Day의 유효성을 세팅
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
	public int getMonth() {      //Month의 값을 불러옴
		return month;
	}
	public void setMonth(int month) {      //Month의 유효성을 세팅
		if(month < 1 || month > 12) {
			isValid = false;
		}
		else {
		this.month = month;
		}
	}
	public int getYear() {      //Year의 값을 불러옴
		return year;
	}
	public void setYear(int year) {       //Year의 유효성을 세팅
		if(year < 1) {
			isValid = false;
		}
		else {
		this.year = year;
		}
	}
	
	public MyDate(int day, int month, int year) {      //public으로 MyDate생성자 만듦
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public String isValid() {
		if(isValid) {
			return "유효한 날짜입니다.";
			}
		else {
			return "유효하지 않은 날짜입니다.";
			}
		}
	}
	
	

