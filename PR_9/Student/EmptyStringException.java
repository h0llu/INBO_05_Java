package Student;

public class EmptyStringException extends RuntimeException {
	public EmptyStringException() {
		super("Empty Argument!");
	}
}
