package queue.adt;

public interface IntQueue {
		/**
	     * Puts the given element to the end of the queue.
	     * 
	     * @param value element to be added to the end of queue
	     */
		public void enqueue(int a);
		
		/**
		 * 
		 * @return the element on the front of the queue
		 * @throws Exception if the queue is empty
		 */
		public int dequeue() throws Exception;
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