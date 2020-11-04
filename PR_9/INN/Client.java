package INN;

public class Client {
	private final String fullName;
	private String INN;

	private boolean checkIfInvalidINN(String INN)
		throws InvalidINNException {
		// длина ИНН физ. лица - 12 цифр
		if (INN.length() != 12) {
			throw new InvalidINNException();
		}
		int controlNumber =
		(INN.charAt(0) - '0') * 3 +
		(INN.charAt(1) - '0') * 7 +
		(INN.charAt(2) - '0') * 2 +
		(INN.charAt(3) - '0') * 4 +
		(INN.charAt(4) - '0') * 10 +
		(INN.charAt(5) - '0') * 3 +
		(INN.charAt(6) - '0') * 5 +
		(INN.charAt(7) - '0') * 9 +
		(INN.charAt(8) - '0') * 4 +
		(INN.charAt(9) - '0') * 6 +
		(INN.charAt(10) - '0') * 8;
		controlNumber %= 11;
		if (controlNumber == 10) {
			controlNumber = 0;
		}
		if (controlNumber != (INN.charAt(11) - '0')) {
			throw new InvalidINNException();
		}
		return true;
	}

	public Client(String fullName, String INN) {
		this.fullName = fullName;
		if (checkIfInvalidINN(INN)) {
			this.INN = INN;
		}
	}

	public String getFullName() {
		return fullName;
	}

	public String getINN() {
		return INN;
	}
}