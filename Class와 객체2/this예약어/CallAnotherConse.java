package tthisex;

class Person{
	String name;
	int age;
	
	public Person() {
		this("�̸�����",1);      //this�� ȣ���� ���� ���� ���� ������ statement���߸� ��(������ ���� ���°� X)
		}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person returnSelf() {
		return this;
	}
}
public class CallAnotherConse {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf());
	}

}
