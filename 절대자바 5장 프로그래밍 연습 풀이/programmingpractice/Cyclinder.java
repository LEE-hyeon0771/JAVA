package programmingpractice;

public class Cyclinder {
	public Circle c;
	public double height;
	
	public double getVolume() {
		return c.getArea() * height;
	}
	public Cyclinder(Circle c, double height) {
		this.c = c;
		this.height = height;
	}
	
	public static void main(String[] args) {
		Cyclinder c = new Cyclinder(new Circle(2.8), 5.6);
		System.out.println(c.getVolume());
	}

}
