package tthisex;

class Birthday{
	int day;
	int month;
	int year;

	public void setYear(int year) {
		this.year = year;
	}
	public void printThis() {
		System.out.println(this);
	}
}
public class ThitsExample {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		b1.setYear(2000);
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		
		System.out.println(b2);
		b2.printThis();

	}

}
