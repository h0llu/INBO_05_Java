package Task2;

public class Client {
	private Chair chair;
	private final AbstractChairFactory factory;

	public Client() {
		this.factory = new ChairFactory();
	}

	public void setChair(ChairType type) {
		switch (type) {
			case FUNCTIONAL -> chair = factory.createFunctionalChair();
			case MAGIC -> chair = factory.createMagicChair();
			case VICTORIAN -> chair = factory.createVictorianChair();
		}
	}

	public void sit() {
		chair.sit();
	}
}