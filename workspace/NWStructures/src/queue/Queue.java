package queue;


public class Queue<E extends Comparable<E>>
  	  extends QueueByCompositionWithArrayList<E>
//    extends QueueByCompositionWithLRStruct<E>
//    extends HeapByCompositionWithArray<E>
//    extends HeapByCompositionWithBRStruct<E>
    implements IQueue<E> {}

