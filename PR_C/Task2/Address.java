package Task2;

import java.util.StringTokenizer;

public class Address {
	private final String country;
	private final String region;
	private final String city;
	private final String street;
	private final String house;
	private final String block;
	private final String flat;

	public Address(String address) {
		String[] addressArray = address.split(",");
		assert addressArray.length == 7;
		country = addressArray[0];
		region = addressArray[1];
		city = addressArray[2];
		street = addressArray[3];
		house = addressArray[4];
		block = addressArray[5];
		flat = addressArray[6];
	}

	public Address(String address, String d) {
		StringTokenizer tokenizer = new StringTokenizer(address, d);
		assert tokenizer.countTokens() == 7;
		country = tokenizer.nextToken();
		region = tokenizer.nextToken();
		city = tokenizer.nextToken();
		street = tokenizer.nextToken();
		house = tokenizer.nextToken();
		block = tokenizer.nextToken();
		flat = tokenizer.nextToken();
	}

	@Override
	public String toString() {
		return "Address{" +
				"country='" + country + '\'' +
				", region='" + region + '\'' +
				", city='" + city + '\'' +
				", street='" + street + '\'' +
				", house='" + house + '\'' +
				", block='" + block + '\'' +
				", flat='" + flat + '\'' +
				'}';
	}
}