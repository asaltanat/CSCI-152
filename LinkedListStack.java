package queue.impl;

public class LinkedListStack<T> implements queue.adt.Stack<T> {

	private Node<T> top;
	private int size;
	
	public LinkedListStack()
	{
		setTop(null);
		size=0;
	}

	public void setTop(Node<T> top) {
		this.top = top;
	}
	@Override
	public void push(T value) {
		Node <T> mnode = new Node<T>(value);
		if(top == null)
			top = mnode;
		else
		{
			mnode.setLink(top);
			top = mnode;
		}
		size++;
	}
	@Override
	public T pop() throws Exception {
		if(size == 0)
		{
			throw new Exception("Empty");
		}
		else 
		{
			Node <T> t = top;
			top = t.getLink();
			size--;
			return t.getValue();
		}
	}
	@Override
	public int getSize() {
		return size;
	}
	@Override
	public void clear() {

		setTop(null);
		size=0;
		
	}
	public String toString()
	{
		String ans ="";
		Node <T> snode = top;
		while(snode!=null)
		{
			ans = ans+" "+snode.getValue();
			snode = snode.getLink();
		}
		return ans;
	}
}
