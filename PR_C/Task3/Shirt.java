package Task3;

public class Shirt {
	private final String vendorCode;
	private final String name;
	private final String color;
	private final String size;

	public Shirt(String shirt) {
		String[] shirtArray = shirt.split(",");
		assert shirtArray.length == 4;
		vendorCode = shirtArray[0];
		name = shirtArray[1];
		color = shirtArray[2];
		size = shirtArray[3];
	}

	@Override
	public String toString() {
		return "Shirt{" +
				"vendorCode='" + vendorCode + '\'' +
				", name='" + name + '\'' +
				", color='" + color + '\'' +
				", size='" + size + '\'' +
				'}';
	}
}