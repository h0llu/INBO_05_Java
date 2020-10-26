package PR8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E> {
	private final int capacity;

	public BoundedWaitList(int capacity) {
		this.capacity = capacity;
		content = new ConcurrentLinkedQueue<>();
	}

	public int getCapacity() {
		return capacity;
	}

	public void add(E element) {
		if (content.size() < capacity) {
			content.add(element);
		}
	}

	@Override
	public String toString() {
		return content.toString();
	}
}
