package classpart;



public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/*public Student(int id, String name) {   //������->�̷��� �Ű������� �� ��� main�ȿ��� ������(  )�ȿ� �μ��� ���������
		studentID = id;                         //����Ʈ �����ڰ� �������Ƿ�
		studentName  = name; 
	}
	1. Student studentLee = new Student(100,"�̼���");    new Student�� ����Ʈ �����ڿ� �ش��ϴ� �� ���������
	   //studentLee�� ��������
	studentLee.address = "����� ���ʱ� ���ʵ�";
	
	studentLee.showStudentInfor(); //-> main����� �̷������� ���־����
	
	2. public Student() {} -> ���� �߰�����*/
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
