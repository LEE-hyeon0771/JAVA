package arraylist;

public class studentTest {

	public static void main(String[] args) {
		
		Student Lee = new Student(1001, "Lee");
		Lee.addSubject("����",100);
		Lee.addSubject("����",90);
		
		Lee.showStudentInfo();
		System.out.println("===============");
		Student Kim = new Student(1002, "Kim");
		Kim.addSubject("����",100);
		Kim.addSubject("����",90);
		Kim.addSubject("����",80);
		
		Kim.showStudentInfo();
		
	}

}
