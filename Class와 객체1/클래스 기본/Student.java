package classpart;



public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/*public Student(int id, String name) {   //생성자->이렇게 매개변수를 줄 경우 main안에서 생성자(  )안에 인수를 적어줘야함
		studentID = id;                         //디폴트 생성자가 없어지므로
		studentName  = name; 
	}
	1. Student studentLee = new Student(100,"이순신");    new Student에 디폴트 생성자에 해당하는 값 적어줘야함
	   //studentLee는 참조변수
	studentLee.address = "서울시 서초구 서초동";
	
	studentLee.showStudentInfor(); //-> main출력을 이런식으로 해주어야함
	
	2. public Student() {} -> 직접 추가해줌*/
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
}
