package queue.adt;

public interface Set<T> {
	/**
	 * 
	 * @param value
	 */
	public void add(T value);
	/**
	 * 
	 * @param value
	 * @return whether
	 */
	public boolean contains(T value);
/**
 * 
 * @param value
 * @return
 * @throws Exception 
 */
	public boolean remove (T value) throws Exception;
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public T removeAny () throws Exception;
	/**
	 * 
	 * @return
	 */
	public int getSize();
	/**
	 * 
	 */
	public void clear();
	/**
	 * 
	 * @return
	 */
	public String toString();
}
