package homework_7;

public class Person {
	public String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public boolean equals(Person p) {
			if(name.equals(p.name)) {
				return true;
			}
			else {
				return false;
			}
	}
}
