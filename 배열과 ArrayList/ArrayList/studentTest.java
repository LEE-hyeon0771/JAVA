package arraylist;

public class studentTest {

	public static void main(String[] args) {
		
		Student Lee = new Student(1001, "Lee");
		Lee.addSubject("국어",100);
		Lee.addSubject("수학",90);
		
		Lee.showStudentInfo();
		System.out.println("===============");
		Student Kim = new Student(1002, "Kim");
		Kim.addSubject("국어",100);
		Kim.addSubject("수학",90);
		Kim.addSubject("영어",80);
		
		Kim.showStudentInfo();
		
	}

}
