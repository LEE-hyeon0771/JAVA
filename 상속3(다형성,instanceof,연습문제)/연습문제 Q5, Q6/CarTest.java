package practice;

import java.util.ArrayList;



public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();    //ArrayList로 넣을 경우 template을 final로 선언 X
		carList.add(new Sonata());
		carList.add(new Avante());
		carList.add(new Grandeur());
		carList.add(new Genesis());
		for(Car car : carList) {
			car.run();
			System.out.println("===================");
		}
	}

}
