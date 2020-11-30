package Task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {
	private String number;

	public Number(String number) throws PhoneNumberException {
		// +<Код страны><Номер 10 цифр>
		Pattern international = Pattern.compile("\\+[0-9]{1,3}[0-9]{10}");
		Matcher interMatcher = international.matcher(number);
		// 8<Номер 10 цифр>
		Pattern russian = Pattern.compile("8[0-9]{10}");
		Matcher rusMatcher = russian.matcher(number);
		if (!interMatcher.matches() && !rusMatcher.matches()) {
			throw new PhoneNumberException(number + " doesn't match the number pattern");
		}
		this.number = number;
		convertTo(interMatcher.matches() ? Format.INTERNATIONAL : Format.RUSSIAN);
	}

	private void convertTo(Format format) {
		StringBuilder numberBuilder = new StringBuilder();
		// длина кода страны
		int countryCode = number.length() - 11;
		//+<Код страны>
		switch (format) {
			case INTERNATIONAL -> numberBuilder.append(number, 0, countryCode + 1);
			case RUSSIAN -> numberBuilder.append("+7");
		}

		numberBuilder.append(number, countryCode + 1, countryCode + 4);
		numberBuilder.append("-").append(number, countryCode + 4, countryCode + 7);
		numberBuilder.append("-").append(number.substring(countryCode + 7));

		number = numberBuilder.toString();
	}

	@Override
	public String toString() {
		return "Number{" +
				"number='" + number + '\'' +
				'}';
	}

	private enum Format {
		RUSSIAN, INTERNATIONAL
	}
}