package Task2;

// inv: first in - first out
public interface Queue {

	// pre: -
	// post: last element = new element,
	//       other elements hasn't changed
	void enqueue(Object element);

	// pre: !isEmpty
	// post: first element of queue returned,
	//       new start = next element,
	//       other elements hasn't changed
	Object dequeue();

	// pre: !isEmpty
	// post: first element of queue returned,
	//       other elements hasn't changed
	Object element();

	// pre: -
	// post: queue hasn't changed,
	//       size of queue returned
	int size();

	// pre: -
	// post: queue hasn't changed
	//       0 returned if queue is empty,
	//       1 returned if queue isn't empty
	boolean isEmpty();

	// pre: -
	// post: isEmpty
	void clear();
}