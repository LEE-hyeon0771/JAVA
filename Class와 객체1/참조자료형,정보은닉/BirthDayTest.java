package hiding;

class BirthDay {
	private int day;      //private으로 할 경우 반드시 getter&setter를 이용해서 출력
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("날짜 오류입니다.");
			}
		}
		else {
			this.day = day;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
public class BirthDayTest{           //main을 따로 class를 안 만들고 한 파일 안에서 출력문으로 낼때는 이름을 출력문 class로 변경
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		day.setDay(30);
		day.setMonth(2);
		day.setYear(2018);
		
	}
}
