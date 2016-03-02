package queue;

import lrstruct.LRStruct;
import lrstruct.visitors.EmptyVisitor;

/**
 * A simple time-ordered queue, defined by composition with an LRStruct<E>
 * @author Carl Alphonce
 */
public class QueueByCompositionWithLRStruct<E> implements IQueue<E> {

	private LRStruct<E> _front;
	private LRStruct<E> _back;
	private int _size;

	public QueueByCompositionWithLRStruct() {
		_front = new LRStruct<E>();
		_back = _front;
		_size = 0;
	}
	
	public int size() { return _size; }
	
	@Override
	public void enqueue(E item) {
		_back.insertFront(item);
		_back = _back.getRest();
		_size++;
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			throw new EmptyQueueException("Cannot dequeue an empty queue.");
		}
		else {
			E item = _front.getDatum();
			_front = _front.getRest();
			_size--;
			return item;
// NOTE: We cannot implement as follows, because emptying the queue and then adding to 
// it disconnects the front from the back; with the following implementation the test 
// fails:
//			_size--;
//			return _front.removeFront();
		}
	}
	
	@Override
	public E peek() {
		if (isEmpty()) {
			throw new EmptyQueueException("Cannot peek an empty queue.");
		}
		else {
			return _front.getDatum();
		}
	}

//	@Override
//	public boolean isEmpty() {
//		return _size == 0;
////		return _front.execute(new EmptyVisitor<E>(), null);
//	}

	private boolean isEmpty() {
		return _front.execute(new EmptyVisitor<E>(), null);
	}
	
	@Override public String toString() { return _front.toString(); }

	@Override public String name() {
		return "Q(LRStruct)";
	}
}
