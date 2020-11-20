package Task2;

public class ArrayQueue extends AbstractQueue {
	private int start = 0;
	private int end = -1;
	private Object[] elements = new Object[10];

	// pre: -
	// post: new length of queue = size / 2
	//       if size was twice smaller than array's length,
	//       new length of queue = size * 2
	//       if size was equal to array's length,
	//       queue hasn't changed
	private void resizeIfRequired() {
		if (size() == elements.length || (size() * 2 < elements.length && elements.length > 10)) {
			Object[] newElements;
			if (size() == elements.length) {
				newElements = new Object[elements.length * 2];
			}
			else {
				newElements = new Object[elements.length / 2];
			}
			if (start <= end) {
				System.arraycopy(elements, start, newElements, 0, size());
			}
			else {
				System.arraycopy(elements, start, newElements, 0, elements.length - start);
				System.arraycopy(elements, 0, newElements, elements.length - start, end);
			}
			end = size() - 1;
			start = 0;
			elements = newElements;
		}
	}

	public void enqueue(Object element) {
		end = (end + 1) % elements.length;
		elements[end] = element;
		resizeIfRequired();
	}

	public Object dequeue() {
		assert !isEmpty();

		Object temp = elements[start];
		elements[start] = null;
		start = (start + 1) % elements.length;

		resizeIfRequired();
		return temp;
	}

	public Object element() {
		assert !isEmpty();
		return elements[start];
	}

	public int size() {
		return 1 + end - start + (start > end + 1 ? elements.length : 0);
	}

	@Override
	public String toString() {
		boolean first = true;
		StringBuilder out = new StringBuilder();
		for (Object element : elements) {
			if (element == null) {
				continue;
			}
			if (!first) {
				out.append(", ");
			}
			first = false;
			out.append(element.toString());
		}
		return String.valueOf(out);
	}
}