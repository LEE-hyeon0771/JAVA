
public class Dice {
	private int sides;
	
	public Dice() {
		setSides(6);
	}
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public Dice(int n) {
		sides = n;
	}
}
