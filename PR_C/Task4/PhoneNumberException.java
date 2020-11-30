package Task4;

public class PhoneNumberException extends Exception {
	public PhoneNumberException(String message) {
		super("PhoneNumberException: " + message);
	}
}