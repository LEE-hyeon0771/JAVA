package programmingpractice6;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee r = new Regular("�̼���", 35, "����", "�λ��");
		Employee t = new Temporary("�庸��", 25, "��õ", "�渮��");
		((Regular) r).setSalary(5000000);
		r.printInfo();
		((Temporary) t).setWorkHours(120);
		t.printInfo();
	}

}
