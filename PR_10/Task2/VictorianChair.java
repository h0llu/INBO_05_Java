package Task2;

public class VictorianChair implements Chair {
	private final int age;

	public VictorianChair(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public void sit() {
		System.out.println("You're sitting on a victorian chair");
	}
}
