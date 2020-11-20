package Task3.Expression;

public class Variable implements Expression {
	private final String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public double evaluate(double x) {
		return x;
	}

	@Override
	public int evaluate(int x) {
		return x;
	}
}
