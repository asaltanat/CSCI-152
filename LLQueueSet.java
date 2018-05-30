package queue.impl;

import queue.adt.Set;

public class LLQueueSet <T> implements Set<T>{
	
	private LinkedListQueue<T> queue;
	private int size;
	
	public LLQueueSet()
	{
		queue = new LinkedListQueue<T>();
		size = 0;
	}
	@Override
	public void add(T value) {
		if(!contains(value)) {
			queue.enqueue(value);
			size++;
		}
	}

	@Override
	public boolean contains(T value) {
		for(int i  = 0; i< queue.getSize(); i++)
		{
			T x;
			try {
				x = queue.dequeue();
				queue.enqueue(x);
				
				if(x.equals(value))
				{
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean remove(T value) throws Exception {
		if(contains(value)) {
			int s = size;
			while(s>0)
			{
				s--;
				T x = queue.dequeue();
				if(!x.equals(value))
				{
					queue.enqueue(x);
				}
			}
			size--;
			return true;
		}
		return false;
	}

	@Override
	public T removeAny() throws Exception {
		if(size>0) {
		   T x = queue.dequeue();
	        size--;
		    return x;
		}
		else
		throw new Exception ("This is impossible");
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {

		queue = new LinkedListQueue<T>();
		size = 0;
	}
	
	public String toString()
	{
		String ans = "{";
		for(int i = 0; i<queue.getSize(); ++i)
		{
			T x;
			try {
				x = queue.dequeue();
				queue.enqueue(x);
				ans = ans+" "+x;
			}
			catch (Exception e)
			{
				
			}
			
		}
		
		return ans+"}";
	}
}
