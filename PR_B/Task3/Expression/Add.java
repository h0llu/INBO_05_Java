package Task3.Expression;

public class Add extends BinaryOperation {

	public Add(Expression left, Expression right) {
		super(left, right);
	}

	protected int count(int x) {
		return left.evaluate(x) + right.evaluate(x);
	}

	protected double count(double x) {
		return left.evaluate(x) + right.evaluate(x);
	}
}
