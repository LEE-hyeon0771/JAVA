package classpart;

public class StudentTest {
	public static void main(String[] args) {
	
		
	Student studentLee = new Student();    //new ���� Student�� ������     �Ǿ� Student�� ��ü Ÿ��(�ݵ�� new�� ���)
	studentLee.studentName = "�̼���";     //studentLee�� ��������
	studentLee.address = "����� ���ʱ� ���ʵ�";
	studentLee.studentID = 100;
	studentLee.showStudentInfor();
	
	Student studentKim = new Student();    //new ���� Student�� ������
	studentKim.studentName = "������";     //studentLee�� ��������
	studentKim.address = "����� �������� ���ǵ���";
	studentKim.studentID = 101;
	studentKim.showStudentInfor();
	
	System.out.println(studentLee);   //���������� ������ ���
	System.out.println(studentKim);
	}

}
