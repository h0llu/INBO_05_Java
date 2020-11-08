package Task2;

public class MagicChair implements Chair {
	void doMagic() {
		System.out.println("Abracadabra!");
	}

	@Override
	public void sit() {
		System.out.println("You're sitting on a magic chair");
	}
}