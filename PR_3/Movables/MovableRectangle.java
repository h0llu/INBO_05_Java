package Movables;

public class MovableRectangle implements Movable {
	private MovablePoint topLeft;
	private MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	/* Проверяет совпадение скоростей у двух точек
	   Используется при попытке передвинуть прямоугольник */
	private boolean isValidMovement() {
		return topLeft.xSpeed == bottomRight.xSpeed &&
			   topLeft.ySpeed == bottomRight.ySpeed;
	}

	@Override
	public String toString() {
		return "Rectangle with top left point:\n" + topLeft.toString() +
				"\nAnd bottom right point:\n" + bottomRight.toString();
	}

	@Override
	public void moveUp() {
		if (isValidMovement()) {
			topLeft.moveUp();
			bottomRight.moveUp();
		}
	}

	@Override
	public void moveDown() {
		if (isValidMovement()) {
			topLeft.moveDown();
			bottomRight.moveDown();
		}
	}

	@Override
	public void moveLeft() {
		if (isValidMovement()) {
			topLeft.moveLeft();
			bottomRight.moveLeft();
		}
	}

	@Override
	public void moveRight() {
		if (isValidMovement()) {
			topLeft.moveRight();
			bottomRight.moveRight();
		}
	}
}