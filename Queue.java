package queue.adt;
/**
 * A new generic 
 * @param <T>
 */
public interface Queue <T>{
		/**
	     * Puts the given element to the end of the queue.
	     * 
	     * @param value element to be added to the end of queue
	     */
		public void enqueue(T i);
		
		/**
		 * 
		 * @return the element on the front of the queue
		 * @throws Exception if the queue is empty
		 */
		public T dequeue() throws Exception;
		/**
		 * 
		 * @return the size of the queue
	 	 */
		public int getSize();
		/**
		 * clears the queue
		 */
		public void clear();
		/**
		 * 
		 * @return the whole queue
		 */
		public String toString ();

}