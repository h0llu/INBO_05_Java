package Ball_Task;

public class Ball {
	private int diameter;
	private String color;

	Ball(String color, int diameter) {
		this.color = color;
		this.diameter = diameter;
	}

	Ball(String color) {
		this.color = color;
		this.diameter = 1;
	}

	Ball() {
		this.color = "Black";
		this.diameter = 1;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDiameter() {
		return diameter;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "The ball is " + color + " and its diameter is " + diameter + " meters";
	}
}