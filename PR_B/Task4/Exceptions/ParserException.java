package Task4.Exceptions;

public class ParserException extends Exception {
	public ParserException(String message) {
		super("Parsing error: " + message);
	}
}