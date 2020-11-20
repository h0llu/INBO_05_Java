package Task4.Expression;

import Task4.Exceptions.*;

public abstract class UnaryOperation implements TripleExpression {
	private final TripleExpression expression;

	public UnaryOperation(TripleExpression expression) {
		this.expression = expression;
	}

	protected abstract int count (int expression) throws CountException, DivisionByZeroException, OverflowException;
	protected abstract double count (double expression) throws CountException, DivisionByZeroException, OverflowException;

	@Override
	public int evaluate(int x, int y, int z) throws CountException, DivisionByZeroException, OverflowException {
		return count(expression.evaluate(x, y, z));
	}

	@Override
	public double evaluate(double x, double y, double z) throws CountException, DivisionByZeroException, OverflowException {
		return count(expression.evaluate(x, y, z));
	}
}