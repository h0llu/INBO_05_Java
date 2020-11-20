package Task4.Exceptions;

public class OverflowException extends Exception {
	public OverflowException(String message) {
		super("Overflow error: " + message);
	}
}
