package practice;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	public void washCar() {
		System.out.println("세차를 합니다.");
	}
	public void run() {       //template 메서드를 final로 선언해버리면 ArrayList에서 문제가 발생한다.
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}
}
