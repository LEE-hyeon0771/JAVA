package staticEx;

public class Student3 {
	private static int serialNum = 999;
	int studentID;
	int cardNum;
	String studentName;
	
	public Student3() {
		serialNum++;
		studentID = serialNum;
		cardNum = studentID + 100;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	

	public String getStudentName() {
		return studentName;
	}

	
	
	
	
}
