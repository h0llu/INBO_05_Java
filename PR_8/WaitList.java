package PR8;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
	protected Queue<E> content;

	public WaitList() {
		content = new ConcurrentLinkedQueue<E>();
	}

	public WaitList(ConcurrentLinkedQueue<E> c) {
		content = c;
	}

	@Override
	public void add(E element) {
		content.add(element);
	}

	@Override
	public E remove() {
		return content.remove();
	}

	@Override
	public boolean contains(E element) {
		return content.contains(element);
	}

	@Override
	public boolean containsAll(Collection<E> c) {
		return content.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return content.isEmpty();
	}

	@Override
	public String toString() {
		return content.toString();
	}
}
