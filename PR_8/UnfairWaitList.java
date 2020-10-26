package PR8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {
	public UnfairWaitList() {
		content = new ConcurrentLinkedQueue<>();
	}

	public void remove(E element) {
		content.remove(element);
	}

	public void moveToBack(E element) {
		if (content.contains(element)) {
			content.add(content.remove());
		}
	}
}
