package practice;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	public void washCar() {
		System.out.println("������ �մϴ�.");
	}
	public void run() {       //template �޼��带 final�� �����ع����� ArrayList���� ������ �߻��Ѵ�.
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}
}
