package Task1;

public class Person {
	private final String firstName;
	private final String middleName;
	private final String lastName;

	public Person(String lastName, String firstName, String middleName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public Person(String lastName, String firstName) {
		this(lastName, firstName, "");
	}

	public Person(String lastName) {
		this(lastName, "", "");
	}

	public String returnFullName() {
		return "Person: {" + lastName + " " + firstName + " " + middleName + "}";
	}
}