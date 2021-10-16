package programmingpractice;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student();
		Lee.setDept("µğÁöÅĞÇï½ºÄÉ¾îÇĞºÎ");
		Lee.setNumber(2021247013);
		
		System.out.println(Lee.getDept()+ ","+ Lee.getNumber());
	}

}
