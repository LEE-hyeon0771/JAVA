package template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		Car myCar = new ManualCar();
		myCar.run();
		
		System.out.println("=== ���� �����ϴ� �ڵ��� ===");
		Car yourCar = new AiCar();
		yourCar.run();
	}

}
