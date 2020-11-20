package Task2;

public abstract class AbstractQueue implements Queue {
	public final void clear() {
		while (!isEmpty()) {
			dequeue();
		}
	}

	public final boolean isEmpty() {
		return size() == 0;
	}
}
