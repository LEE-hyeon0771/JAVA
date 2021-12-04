package homework_7;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("È«±æµ¿");
		System.out.println(p1.equals(new Person("È«±æµ¿")));
		System.out.println(p1.equals(new Person("ÃÖ¿µÅÂ")));
	}

}
