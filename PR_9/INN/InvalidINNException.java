package INN;

public class InvalidINNException extends RuntimeException {
	public InvalidINNException() {
		super("Invalid INN!");
	}
}