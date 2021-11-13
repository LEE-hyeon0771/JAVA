package programmingpractice6;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee r = new Regular("이순신", 35, "서울", "인사부");
		Employee t = new Temporary("장보고", 25, "인천", "경리부");
		((Regular) r).setSalary(5000000);
		r.printInfo();
		((Temporary) t).setWorkHours(120);
		t.printInfo();
	}

}
