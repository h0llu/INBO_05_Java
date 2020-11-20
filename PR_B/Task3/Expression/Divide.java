package Task3.Expression;

public class Divide extends BinaryOperation {
	public Divide(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	protected int count(int x) {
		return left.evaluate(x) / right.evaluate(x);
	}

	@Override
	protected double count(double x) {
		return left.evaluate(x) / right.evaluate(x);
	}
}
