package staticEx;

public class Student {
	
	private static int serialNum = 10000;
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {      //private static�̹Ƿ� �� ���� �Ƚ�Ű�� �������⸸ �ϱ����� get�� ����
		int i = 10;   //��������
		
		i++;
		System.out.println(i);
		
		     //public static �ȿ����� �������, �ν��Ͻ� ���� ���Ұ�
		return serialNum;       //static ����, class����
	}

	
	
	
}
