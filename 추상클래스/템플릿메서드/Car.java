package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void washCar() {}        //abstract가 아니라서 하위class에서 구현의 의무를 가지지 않음.
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public final void run() {   //final 하면 다른 class에서 run을 오버라이딩 X  -> 템플릿 메서드
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
