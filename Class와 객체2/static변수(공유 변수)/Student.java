package staticEx;

public class Student {
	
	private static int serialNum = 10000;
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {      //private static이므로 값 변경 안시키고 가져가기만 하기위해 get만 제공
		int i = 10;   //지역변수
		
		i++;
		System.out.println(i);
		
		     //public static 안에서는 멤버변수, 인스턴스 변수 사용불가
		return serialNum;       //static 변수, class변수
	}

	
	
	
}
