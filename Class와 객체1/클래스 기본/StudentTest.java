package classpart;

public class StudentTest {
	public static void main(String[] args) {
	
		
	Student studentLee = new Student();    //new 뒤의 Student는 생성자     맨앞 Student는 객체 타입(반드시 new로 사용)
	studentLee.studentName = "이순신";     //studentLee는 참조변수
	studentLee.address = "서울시 서초구 서초동";
	studentLee.studentID = 100;
	studentLee.showStudentInfor();
	
	Student studentKim = new Student();    //new 뒤의 Student는 생성자
	studentKim.studentName = "김유신";     //studentLee는 참조변수
	studentKim.address = "서울시 영등포구 여의도동";
	studentKim.studentID = 101;
	studentKim.showStudentInfor();
	
	System.out.println(studentLee);   //참조변수의 참조값 출력
	System.out.println(studentKim);
	}

}
