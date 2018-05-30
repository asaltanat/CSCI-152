package queue.impl;

import queue.adt.Set;

public class LLStackSet <T> implements Set<T>{
	
	private LinkedListStack<T> queue;
	private int size;
	
	public LLStackSet()
	{
		queue = new LinkedListStack<T>();
		size = 0;
	}
	@Override
	public void add(T value) {
		if(!contains(value)) {
			queue.push(value);
			size++;
		}
	}

	@Override
	public boolean contains(T value) {
		int ts = queue.getSize();
		boolean f = false;
		LinkedListStack<T> use = new LinkedListStack<T>();
		for(int i  = 0; i<ts; i++)
		{
			T x;
			try {
				x = queue.pop();
				use.push(x);
				if(x.equals(value))
				{
					f = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		while(use.getSize()>0)
		{
			try {
				queue.push(use.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return f;
	}

	@Override
	public boolean remove(T value) throws Exception {
		if(contains(value)) {
			LinkedListStack<T>use = new LinkedListStack<T>(); 
			int s = size;
			while(s>0)
			{
				s--;
				T x = queue.pop();
				if(!x.equals(value))
				{
					use.push(x);
				}
			}
			while(use.getSize()>0)
			{
				queue.push(use.pop());
			}
			size--;
			return true;
		}
		return false;
	}

	@Override
	public T removeAny() throws Exception {
		if(size>0) {
		   T x = queue.pop();
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

		queue = new LinkedListStack<T>();
		size = 0;
	}
	
	public String toString()
	{
		String ans = "{";
		LinkedListStack<T> use = new LinkedListStack<T>();
		while(0<queue.getSize())
		{
			T x;
			try {
				x = queue.pop();
				use.push(x);
				ans = ans+" "+x;
			}
			catch (Exception e)
			{
				//impossible
			}
		}
		while(use.getSize()>0)
			try {
				queue.push(use.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		
		return ans+"}";
	}
}
