package code;

/**
 * Interface for a unary function, mapping a member of type T1 to 
 * a member of T2.
 * 
 * @param <T1> - the domain type of the function
 * @param <T2> - the range type of the function
 */
public interface UnaryFunction<T1, T2> {
	public T2 apply(T1 datum);
}
