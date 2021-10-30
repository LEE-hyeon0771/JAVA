package practice;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.company);
		System.out.println(c.model);
		System.out.println(c.color);
		System.out.println(c.maxSpeed);
		System.out.println(c.speed);
		
		System.out.println();
		
		Car c1 = new Car("람보르기니");
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
		System.out.println(c1.speed);
		
	}

}
