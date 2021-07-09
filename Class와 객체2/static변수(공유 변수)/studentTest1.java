package staticEx;

public class studentTest1 {

	public static void main(String[] args) {
		
		System.out.println(Student.getSerialNum());
		
		Student studentJ = new Student();				//Class네임은 Student
		System.out.println(studentJ.studentID);
		
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
		//System.out.println(Student.serialNum);   //클래스 변수 = static변수 
		//System.out.println(Student.serialNum);
		
		
	}

}
