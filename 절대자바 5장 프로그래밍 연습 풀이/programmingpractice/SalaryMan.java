package programmingpractice;

public class SalaryMan {
	int salary = 1000000; //�� �޿��� ����
	
	public SalaryMan() {}
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	public int getAnnualGross() {
		return salary*12 + salary*5;
	}
}
