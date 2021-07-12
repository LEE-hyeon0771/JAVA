package practice6;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Person Kim = new Person("Kim", 4000);
		Person Lee = new Person("Lee", 4500);
		StarCoffee starcoffee = new StarCoffee();
		BeanCoffee beancoffee = new BeanCoffee();
		
		Kim.buyStarCoffee(starcoffee, 4000);
		Lee.buyBeanCoffee(beancoffee, 4500);
	}

}
