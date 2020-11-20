package Task3.Expression;

public abstract class BinaryOperation implements Expression {
	protected Expression left;
	protected Expression right;

	public BinaryOperation(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	protected abstract int count(int x);
	protected abstract double count(double x);

	@Override
	public int evaluate(int x) {
		return count(x);
	}

	@Override
	public double evaluate(double x) {
		return count(x);
	}
}