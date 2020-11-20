package Task2;

public class LinkedQueue extends AbstractQueue {
	private int size = 0;
	private Node head = null;
	private Node tail = null;

	public void enqueue(Object element) {
		Node node = new Node(element);
		if (head == null) {
			head = node;
			tail = node;
		}
		else {
			node.next = tail;
			tail.prev = node;
			tail = tail.prev;
		}
		size++;
	}

	public Object dequeue() {
		Node node = head;
		head = head.prev;
		size--;
		return node.value;
	}

	public Object element() {
		return head.value;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		boolean first = true;
		StringBuilder out = new StringBuilder();
		Node node = head;
		while (node != null) {
			if (!first) {
				out.append(", ");
			}
			out.append(node.value.toString());
			node = node.prev;
			first = false;
		}
		return out.toString();
	}

	private class Node {
		Object value;
		Node next;
		Node prev;

		public Node(Object value) {
			this.value = value;
			this.next = null;
			this.prev = null;
		}

		public Node(Object value, Node next) {
			this.value = value;
			this.next = next;
			this.prev = null;
		}

		public Node(Object value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}
}
