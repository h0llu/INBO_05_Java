package Task3.Expression;

public class Const implements Expression {
	private final int intConst;
	private final double doubleConst;

	public Const(double doubleConst) {
		this.doubleConst = doubleConst;
		this.intConst = (int)doubleConst;
	}

	public Const(int intConst) {
		this.intConst = intConst;
		this.doubleConst = intConst;
	}

	@Override
	public double evaluate(double x) {
		return doubleConst;
	}

	@Override
	public int evaluate(int x) {
		return intConst;
	}
}