package practice;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	public Car() {
		company = "현대자동차";
		model = "그랜져";
		color = "검정";
		maxSpeed = 240;
		speed = 0;
		
	}
	public Car(String company) {
		this.company = company;
	}
}
