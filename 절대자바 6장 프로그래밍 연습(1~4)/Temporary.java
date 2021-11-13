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
		System.out.println(name + "은(는) 비정규직입니다. 일한시간은 " + workhours + "이고, 급여는 " + paybill + "입니다.");
	}
}
