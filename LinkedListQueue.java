package queue.impl;

import queue.adt.Queue;
public class LinkedListQueue <T> implements Queue<T>{

	private Node<T> front;
	private int size;
	private Node<T> back;
	
	public LinkedListQueue ()
	{
		setBack(null);
		setFront(null);
	    size=0;
	}
	public void setBack(Node<T> back) {
		this.back=back;
	}
	@Override
	public void enqueue(T value) {
		Node <T> newnode = new Node <T>(value);
		if(back == null)
		{
			front = newnode;
			back = newnode;
			size++;
		}
		else
		{
			back.setLink(newnode);
			back = back.getLink();
			size++;
		}
	}

	@Override
	public T dequeue() throws Exception {
		if(size == 0)
		{
			throw new Exception("This is empty");
		}
		Node <T> usenode = front;
		front = usenode.getLink(); 
		if(front == null)
		{
			back = null;
		}
		size--;
		return usenode.getValue();
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		setFront(null);
		setBack(null);
		size=0;
	}
	/**
	 * @return the front
	 */
	public Node<T> getFront() {
		return front;
	}

	public Node<T> getBack() {
		return back;
	}
	/**
	 * @param front the front to set
	 */
	public void setFront(Node<T> front) {
		this.front = front;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public String toString()
	{
		String ans = "";
		Node <T> outnode = front;
		if(size == 0)
		{
			return "\n";
		}
		while(outnode!=null)
		{
			ans=ans+" "+outnode.getValue();
			outnode= outnode.getLink();
		}
		return ans+"\n";
	}
}
