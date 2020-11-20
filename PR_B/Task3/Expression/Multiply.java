package Task3.Expression;

public class Multiply extends BinaryOperation {
	public Multiply(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	protected int count(int x) {
		return left.evaluate(x) * right.evaluate(x);
	}

	@Override
	protected double count(double x) {
		return left.evaluate(x) * right.evaluate(x);
	}
}
