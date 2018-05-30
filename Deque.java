package queue.adt;

public interface Deque <T>{
    /**
    *  
    * @param value
    */
	public void pushToFront(T value);
	/**
	 * 
	 * @param value
	 */
	public void pushToBack(T value);
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public T popFromFront() throws Exception;
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public T popFromBack() throws Exception;
	/**
	 * 
	 * @return
	 */
	public int getSize();
	/**
	 * clears the deque
	 */
	public void clear();
	
	public String toString();
}
