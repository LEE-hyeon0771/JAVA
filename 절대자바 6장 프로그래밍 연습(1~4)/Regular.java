package programmingpractice6;

public class Regular extends Employee{
	
	public Regular(String name, int age, String address, String dept) {
		super(name,age,address,dept);
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println(name + "��(��) �������Դϴ�. ������ " + salary);
	}
}
