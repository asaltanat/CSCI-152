package queue.impl;
/**
 * 
 * @author Салтанат Айдарова
 *
 * @param <T>
 */
public class Node<T>{

	private T value;
	private Node<T> link;
	
	public Node(T val)
	{
		value = val;
		link = null;
	}
	/**
	 * 
	 * @return
	 */
	public T getValue()
	{
		return value;		
	}
	/**
	 * 
	 * @param value
	 */
	public void setValue(T value)
	{
		this.value = value;	
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(Node<T> link) {
		this.link = link;
	}
    /**
     * 
     * @return
     */
	public Node <T> getLink()
	{
		return link;
			
	}
}
