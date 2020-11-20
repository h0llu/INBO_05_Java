package Task1;

import Task1.Queue.ArrayQueue;
import Task1.Queue.ArrayQueueADT;
import Task1.Queue.ArrayQueueModule;

public class TestDriver {
	static void ArrayQueueTester() {
		ArrayQueue queue = new ArrayQueue();
		// initial array capacity is 10
		// check resizability
		queue.enqueue(15);
		queue.enqueue(0);
		queue.enqueue(48);
		queue.enqueue(6758);
		queue.enqueue(996);
		queue.enqueue(98675);
		queue.enqueue(79);
		queue.enqueue(893);
		queue.enqueue(1);
		queue.enqueue(97);
		queue.enqueue(4089);
		System.out.println("Enqueued 11 elements, size: 11 == " + queue.size());
		System.out.println(queue);
		// check size decreasing
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Dequeued 7 elements, size: 4 == " + queue.size());
		System.out.println(queue);
		System.out.println("Queue's isEmpty: false == " + queue.isEmpty());
		// check clear()
		queue.clear();
		System.out.println("Queue is cleared, size: 0 == " + queue.size());
		System.out.println("Queue's isEmpty: true == " + queue.isEmpty());
	}

	static void ArrayQueueADTTester() {
		ArrayQueueADT queue = new ArrayQueueADT();
		// initial array capacity is 10
		// check resizability
		ArrayQueueADT.enqueue(queue,15);
		ArrayQueueADT.enqueue(queue,0);
		ArrayQueueADT.enqueue(queue,48);
		ArrayQueueADT.enqueue(queue,6758);
		ArrayQueueADT.enqueue(queue,996);
		ArrayQueueADT.enqueue(queue,98675);
		ArrayQueueADT.enqueue(queue,79);
		ArrayQueueADT.enqueue(queue,893);
		ArrayQueueADT.enqueue(queue,1);
		ArrayQueueADT.enqueue(queue,97);
		ArrayQueueADT.enqueue(queue,4089);

		System.out.println("Enqueued 11 elements, size: 11 == " + ArrayQueueADT.size(queue));
		System.out.println(ArrayQueueADT.toString(queue));
		// check size decreasing
		System.out.println("Dequeue: " + ArrayQueueADT.dequeue(queue));
		System.out.println("Dequeue: " + ArrayQueueADT.dequeue(queue));
		System.out.println("Dequeue: " + ArrayQueueADT.dequeue(queue));
		System.out.println("Dequeue: " + ArrayQueueADT.dequeue(queue));
		System.out.println("Dequeue: " + ArrayQueueADT.dequeue(queue));
		System.out.println("Dequeue: " + ArrayQueueADT.dequeue(queue));
		System.out.println("Dequeue: " + ArrayQueueADT.dequeue(queue));
		System.out.println("Dequeued 7 elements, size: 4 == " + ArrayQueueADT.size(queue));
		System.out.println(ArrayQueueADT.toString(queue));
		System.out.println("Queue's isEmpty: false == " + ArrayQueueADT.isEmpty(queue));
		// check clear()
		ArrayQueueADT.clear(queue);
		System.out.println("Queue is cleared, size: 0 == " + ArrayQueueADT.size(queue));
		System.out.println("Queue's isEmpty: true == " + ArrayQueueADT.isEmpty(queue));
	}

	static void ArrayQueueModuleTester() {
		// initial array capacity is 10
		// check resizability
		ArrayQueueModule.enqueue(15);
		ArrayQueueModule.enqueue(0);
		ArrayQueueModule.enqueue(48);
		ArrayQueueModule.enqueue(6758);
		ArrayQueueModule.enqueue(996);
		ArrayQueueModule.enqueue(98675);
		ArrayQueueModule.enqueue(79);
		ArrayQueueModule.enqueue(893);
		ArrayQueueModule.enqueue(1);
		ArrayQueueModule.enqueue(97);
		ArrayQueueModule.enqueue(4089);

		System.out.println("Enqueued 11 elements, size: 11 == " + ArrayQueueModule.size());
		System.out.println(ArrayQueueModule.staticToString());
		// check size decreasing
		System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
		System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
		System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
		System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
		System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
		System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
		System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
		System.out.println("Dequeued 7 elements, size: 4 == " + ArrayQueueModule.size());
		System.out.println(ArrayQueueModule.staticToString());
		System.out.println("Queue's isEmpty: false == " + ArrayQueueModule.isEmpty());
		// check clear()
		ArrayQueueModule.clear();
		System.out.println("Queue is cleared, size: 0 == " + ArrayQueueModule.size());
		System.out.println("Queue's isEmpty: true == " + ArrayQueueModule.isEmpty());
	}

	public static void main(String[] args) {
		//ArrayQueueModuleTester();
		//ArrayQueueADTTester();
		//ArrayQueueTester();
	}
}