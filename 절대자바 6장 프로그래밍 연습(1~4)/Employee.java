package programmingpractice6;

public class Employee {
	public String name;
	public int age;
	public String address;
	public String dept;
	public int salary;
	
	public Employee(String name, int age, String address, String dept) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.dept = dept;
	}
	
	public void printInfo() {
		System.out.println("�̸�: " + name + ", ����: " + age + ", �ּ�: " + address + ", �μ�: " + dept);
	}
}
