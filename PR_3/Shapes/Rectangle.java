package Shapes;

public class Rectangle extends Shape {
	protected double width;
	protected double length;

	public Rectangle() {
		super();
		width = 1;
		length = 1;
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return width * length;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public String toString() {
		return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
	}
}
