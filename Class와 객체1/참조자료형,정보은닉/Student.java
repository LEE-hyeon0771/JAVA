package reference;

public class Student {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Student() {            //참조 자료형으로 갖다 쓴 Subject들을 생성
		korea = new Subject();
		math = new Subject();
	}
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {  //korea 정보를 세팅하는 메서드
		korea.setSubjectName(name);
		korea.setScore(score);
	}
	
	public void setMath(String name, int score) {   //Math 정보를 세팅하는 메서드
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {           //학생의 정보를 보여주는 메서드
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
