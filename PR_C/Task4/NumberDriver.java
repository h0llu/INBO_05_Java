package Task4;

public class NumberDriver {
	public static void main(String[] args) {
		try {
			// working tests
			Number number1 = new Number("+79651234567");
			Number number2 = new Number("89651234567");
			System.out.println(number1);
			System.out.println(number2);

			// exception test
			Number number3 = new Number("+9654323435");
			System.out.println(number3);
		} catch (PhoneNumberException e) {
			System.err.println(e.getMessage());
		}
	}
}