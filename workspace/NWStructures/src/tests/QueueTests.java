package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import queue.QueueByCompositionWithLRStruct;

public class QueueTests {

	@Test public void test() {
		QueueByCompositionWithLRStruct<String> q = new QueueByCompositionWithLRStruct<String>();
		q.enqueue("Fred");
		System.out.println(q);
		q.enqueue("Wilma");
		System.out.println(q);
		q.enqueue("Pebbles");
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.enqueue("Mal");
		System.out.println(q);
		String expected = "Mal";
		String actual = q.dequeue();
		System.out.println(q);
		assertTrue("", expected.equals(actual));
	}

}
