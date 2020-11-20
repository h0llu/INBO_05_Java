package Task4.Expression;

import Task4.Exceptions.ParserException;

public interface Parser {
	TripleExpression parse(String expression) throws ParserException;
}