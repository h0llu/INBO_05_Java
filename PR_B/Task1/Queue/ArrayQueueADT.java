package Task1.Queue;

// inv: first in - first out
public class ArrayQueueADT {
	private int start = 0;
	private int end = -1;
	private Object[] elements = new Object[10];

	// pre: -
	// post: new length of queue = size / 2
	//       if size was twice smaller than array's length,
	//       new length of queue = size * 2
	//       if size was equal to array's length,
	//       queue hasn't changed
	private static void resizeIfRequired(ArrayQueueADT queue) {
		if (size(queue) == queue.elements.length || (size(queue) * 2 < queue.elements.length && queue.elements.length > 10)) {
			Object[] newElements;
			if (size(queue) == queue.elements.length) {
				newElements = new Object[queue.elements.length * 2];
			} else {
				newElements = new Object[queue.elements.length / 2];
			}
			if (queue.start <= queue.end) {
				System.arraycopy(queue.elements, queue.start, newElements, 0, size(queue));
			} else {
				System.arraycopy(queue.elements, queue.start, newElements, 0,queue.elements.length - queue.start);
				System.arraycopy(queue.elements, 0, newElements, queue.elements.length - queue.start, queue.end);
			}
			queue.end = size(queue) - 1;
			queue.start = 0;
			queue.elements = newElements;
		}
	}

	// pre: -
	// post: last element = new element,
	//       other elements hasn't changed
	public static void enqueue(ArrayQueueADT queue, Object element) {
		queue.end = (queue.end + 1) % queue.elements.length;
		queue.elements[queue.end] = element;

		resizeIfRequired(queue);
	}

	// pre: !isEmpty
	// post: first element of queue returned,
	//       new start = next element,
	//       other elements hasn't changed
	public static Object dequeue(ArrayQueueADT queue) {
		assert !isEmpty(queue);

		Object temp = queue.elements[queue.start];
		queue.elements[queue.start] = null;
		queue.start = (queue.start + 1) % queue.elements.length;

		resizeIfRequired(queue);
		return temp;
	}

	// pre: !isEmpty
	// post: first element of queue returned,
	//       other elements hasn't changed
	public static Object element(ArrayQueueADT queue) {
		assert !isEmpty(queue);
		return queue.elements[queue.start];
	}

	// pre: -
	// post: queue hasn't changed,
	//       size of queue returned
	public static int size(ArrayQueueADT queue) {
		return 1 + queue.end - queue.start + (queue.start > queue.end + 1 ? queue.elements.length : 0);
	}

	// pre: -
	// post: queue hasn't changed
	//       0 returned if queue is empty,
	//       1 returned if queue isn't empty
	public static boolean isEmpty(ArrayQueueADT queue) {
		return size(queue) == 0;
	}

	// pre: -
	// post: isEmpty
	public static void clear(ArrayQueueADT queue) {
		while (!isEmpty(queue)) {
			dequeue(queue);
		}
	}

	public static String toString(ArrayQueueADT queue) {
		boolean first = true;
		StringBuilder out = new StringBuilder();
		for (Object element : queue.elements) {
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