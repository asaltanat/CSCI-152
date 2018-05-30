package queue.impl;

import queue.adt.SortedQueue;

@SuppressWarnings("rawtypes")
public class LinkedListSortedQueue <T extends Comparable> implements SortedQueue<T>{

	private Node<T> front;
	private int size;
	public LinkedListSortedQueue ()
	{
		front = null;
	    size=0;
	}

	@SuppressWarnings("unchecked")
	public void insert(T value)
    {
        Node <T> newnode = new Node<T>(value);
        if(size==0)
        {
            front = newnode;
        }
        else
        {
            if((value.compareTo(front.getValue()))<=0)
            {
                newnode.setLink(front);
                front = newnode;
            }
            else
            {
               Node <T> prev = front;
               Node <T> next = front.getLink();
               if(next == null)
               {
            	   prev.setLink(newnode);
            	   newnode.setLink(null);
               }
               else
               {
               while((value.compareTo(next.getValue()))>0 && next !=null && next.getLink()!=null)
               {
            	   prev = next;
            	   next = next.getLink();
               }
               if(next.getLink() == null)
               {
            	   if(value.compareTo(next.getValue())>0)
            	   {
            		   next.setLink(newnode);
            	   }
            	   else
            	   {
            		   prev.setLink(newnode);
            		   newnode.setLink(next);
            	   }
               }
               else if(value.compareTo(next.getValue())<=0)
               {
            	   prev.setLink(newnode);
            	   newnode.setLink(next);
               }
               }
            }
        }
        size++;
    }

	@Override
	public T dequeue() throws Exception {
		if(size == 0)
		{
			throw new Exception("This is empty");
		}
		Node <T> usenode = front;
		front = usenode.getLink();
		size--;
		return usenode.getValue();
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		front=null;
		size=0;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public String toString()
	{
		if(size == 0)
			return "Empty";
		String ans = "";
		Node <T> outnode = front;
		while(outnode!=null)
		{
			ans=ans+" "+outnode.getValue();
			outnode= outnode.getLink();
		}
		return ans;
	}
}