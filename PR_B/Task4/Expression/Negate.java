package Task4.Expression;

import Task4.Exceptions.*;

public class Negate extends UnaryOperation {
	public Negate(TripleExpression expression) {
		super(expression);
	}

	@Override
	protected int count(int expression) throws OverflowException {
		if (expression == Integer.MIN_VALUE) {
			throw new OverflowException("Negating MIN_VALUE");
		}
		return -expression;
	}

	@Override
	protected double count(double expression) throws OverflowException {
		return -expression;
	}
}
