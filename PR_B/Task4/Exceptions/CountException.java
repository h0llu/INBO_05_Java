package Task4.Exceptions;

public class CountException extends Exception {
	public CountException(String message) {
		super("Counting error: " + message);
	}
}