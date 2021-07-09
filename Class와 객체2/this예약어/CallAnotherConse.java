package tthisex;

class Person{
	String name;
	int age;
	
	public Person() {
		this("이름없음",1);      //this로 호출할 때는 가장 먼저 나오는 statement여야만 함(이전에 뭐든 쓰는거 X)
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
