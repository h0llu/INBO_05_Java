package Task4.Expression;

import Task4.Exceptions.*;

public class Variable implements TripleExpression {
	private final String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public int evaluate(int x, int y, int z) throws CountException {
		return returnVariable(x, y, z);
	}

	@Override
	public double evaluate(double x, double y, double z) throws CountException {
		return returnVariable(x, y, z);
	}

	private <T> T returnVariable(T x, T y, T z) throws CountException {
		switch (name) {
			case "x":
				return x;
			case "y":
				return y;
			case "z":
				return z;
		}
		throw new CountException("variable '" + name + "' doesn't exist");
	}
}
