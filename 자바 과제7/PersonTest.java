package homework_7;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		System.out.println(p1.equals(new Person("ȫ�浿")));
		System.out.println(p1.equals(new Person("�ֿ���")));
	}

}
