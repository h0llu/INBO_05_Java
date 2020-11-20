package Task4.Expression;

import Task4.Exceptions.*;

public abstract class BinaryOperation implements TripleExpression {
	private final TripleExpression left;
	private final TripleExpression right;

	public BinaryOperation(TripleExpression left, TripleExpression right) {
		this.left = left;
		this.right = right;
	}

	protected abstract int count (int left, int right) throws CountException, DivisionByZeroException, OverflowException;
	protected abstract double count (double left, double right) throws CountException, DivisionByZeroException, OverflowException;

	@Override
	public final int evaluate(int x, int y, int z) throws CountException, DivisionByZeroException, OverflowException {
		return count(left.evaluate(x, y, z), right.evaluate(x, y, z));
	}

	@Override
	public final double evaluate(double x, double y, double z) throws CountException, DivisionByZeroException, OverflowException {
		return count(left.evaluate(x, y, z), right.evaluate(x, y, z));
	}

}