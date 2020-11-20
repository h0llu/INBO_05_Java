package Task4.Expression;

import Task4.Exceptions.*;

public interface TripleExpression {
	int evaluate(int x, int y, int z) throws CountException, DivisionByZeroException, OverflowException;
	double evaluate (double x, double y, double z) throws CountException, DivisionByZeroException, OverflowException;
}