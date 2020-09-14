package Shapes;

public class Square extends Rectangle {
	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return length;
	}

	public void setSide(double side) {
		length = side;
		width = side;
	}

	@Override
	public String toString() {
		return "Shape: square, side: " + length + ", color: " + color;
	}
}
