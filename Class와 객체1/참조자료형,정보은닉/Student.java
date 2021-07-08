package reference;

public class Student {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Student() {            //���� �ڷ������� ���� �� Subject���� ����
		korea = new Subject();
		math = new Subject();
	}
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {  //korea ������ �����ϴ� �޼���
		korea.setSubjectName(name);
		korea.setScore(score);
	}
	
	public void setMath(String name, int score) {   //Math ������ �����ϴ� �޼���
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {           //�л��� ������ �����ִ� �޼���
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " �л��� ������ " + total + "�� �Դϴ�.");
	}
}
