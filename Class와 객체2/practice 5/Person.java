package practice6;

public class Person {
	
	String name;
	int money;
	
	Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee starcoffee, int money) {
		String message = starcoffee.purchasing(4000);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "은 " + money + "를 사용하여 " + message);
		}
	}
	public void buyBeanCoffee(BeanCoffee beancoffee, int money) {
		String message = beancoffee.purchasing(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "은 " + money + "를 사용하여 " + message);
		}
	}
}
