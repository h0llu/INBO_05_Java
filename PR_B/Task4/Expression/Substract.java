package Task4.Expression;

import Task4.Exceptions.*;

public class Substract extends BinaryOperation {
	public Substract(TripleExpression left, TripleExpression right) {
		super(left, right);
	}

	@Override
	protected int count(int left, int right) throws OverflowException {
		if ((right > 0 && left < Integer.MIN_VALUE + right) || (right < 0 && left > Integer.MAX_VALUE + right)) {
			throw new OverflowException(left + " - " + right);
		}
		return left - right;
	}

	@Override
	protected double count(double left, double right) throws OverflowException {
		if ((right > 0 && left < -Double.MAX_VALUE + right) || (right < 0 && left > Double.MAX_VALUE + right)) {
			throw new OverflowException(left + " - " + right);
		}
		return left - right;
	}
}