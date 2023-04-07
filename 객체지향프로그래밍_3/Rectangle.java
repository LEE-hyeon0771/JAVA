/*
 * Q: Write Rectangle class that implements the following features:
 *
 * 1. Make RectangleRunner.java run with Rectangle class that you design
 *      in Rectangle.java
 *      a. First of all, take a look at output_RectangleRunner.txt and
 *          plan to make RectangleRunner.class generate the desired output
 *      b. No need to modify RectangleRunner.java. Only write code lines
 *          in Rectangle.java
 *      c. Start by modifying the template in this file (Rectangle.java)
 * 2. In particular, design Rectangle class applying the object design technique
 *      of ADT (Abstract Data Type):
 *      a. instance variables declared as private
 *      b. constructors with width and height variables as initial input parameters
 *      c. methods: calculateArea(), print(), resize()
 *      d. setters and getters for the instance variables
 */

public class Rectangle
{
    /* instance variables go here (width and height) */
	private double width;
	private double height;
	
    /* Constructors */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

    /* Methods: calculateArea(), print(), resize() */
	public double calculateArea() {
		return width * height;
	}
	
	public void print() {
		System.out.println(width + " x " + height);
		for(int i = 0; i<height; i++) {
			for(int j = 0; j<width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void resize(double another_width, double another_height) {
		width = another_width;
		height = another_height;
	}
	
    /* Setters and getters */

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
