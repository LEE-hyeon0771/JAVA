package programmingpractice6;

public class Temporary extends Employee{
	
	public int workhours;
	public int paybill = 10000;
	
	public Temporary(String name, int age, String address, String dept) {
		super(name,age,address,dept);
	}
	

	public void setWorkHours(int workhours) {
		this.workhours = workhours;
		this.salary = workhours * paybill;
	}
	
	public void printInfo() {
		System.out.println(name + "��(��) ���������Դϴ�. ���ѽð��� " + workhours + "�̰�, �޿��� " + paybill + "�Դϴ�.");
	}
}
