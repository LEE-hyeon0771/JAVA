package programmingpractice6;

public class Regular extends Employee{
	
	public Regular(String name, int age, String address, String dept) {
		super(name,age,address,dept);
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println(name + "은(는) 정규직입니다. 월급은 " + salary);
	}
}
