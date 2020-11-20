package Task4.Expression;

import Task4.Exceptions.*;

public class Const implements TripleExpression {
	private final int intValue;
	private final double doubleValue;

	public Const(int intValue) {
		this.intValue = intValue;
		this.doubleValue = intValue;
	}

	public Const(double doubleValue) {
		this.intValue = (int)doubleValue;
		this.doubleValue = doubleValue;
	}

	@Override
	public int evaluate(int x, int y, int z) {
		return intValue;
	}

	@Override
	public double evaluate(double x, double y, double z) {
		return doubleValue;
	}
}
