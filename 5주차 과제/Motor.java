package homework;

public class Motor extends Vehicle{
	public String name = "�ڵ���";
	public int displacement;
	
	public Motor() {
		super();
	}
	public Motor(double maxSpeed, int seater, int displacement) {
		this.maxSpeed = maxSpeed;
		this.seater = seater;
		this.displacement = displacement;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setSeater(int seater) {
		this.seater = seater;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	
	public void printInfo() {
		System.out.print(super.name + ": " + this.name);
		System.out.println(", �ִ�ӵ�: " + maxSpeed + " km");
		System.out.print("����: " + seater + " ��");
		System.out.println(", ��ⷮ: " + displacement + " cc");
	}
	public static void main(String[] args) {
		Motor myCar = new Motor();
		myCar.setMaxSpeed(300);
		myCar.setSeater(2);
		myCar.setDisplacement(3500);
		myCar.printInfo();
	}
}
