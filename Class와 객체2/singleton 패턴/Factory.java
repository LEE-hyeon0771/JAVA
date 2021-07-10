package singleton;

public class Factory {
	
	private static Factory instance = new Factory();
	private Factory() {}
	
	public static Factory getInstance() {
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
}
