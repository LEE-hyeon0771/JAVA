package staticEx;

public class studentTest1 {

	public static void main(String[] args) {
		
		System.out.println(Student.getSerialNum());
		
		Student studentJ = new Student();				//Class������ Student
		System.out.println(studentJ.studentID);
		
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
		//System.out.println(Student.serialNum);   //Ŭ���� ���� = static���� 
		//System.out.println(Student.serialNum);
		
		
	}

}
