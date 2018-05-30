package queue.impl;

import queue.adt.IntQueue;

public class ArrayintQueue implements IntQueue{
	private int[] values;
	private int size;
	private int back;
	private int front;
	private int maxSize;
	
	public ArrayintQueue()
	{
		values = new int[5];
		size=0;
		front = 0;
		back=0;
		maxSize = 5;
	}
	@Override
	public void enqueue(int a) {
		if(size>=maxSize)
		{
			int[] b = new int [maxSize*2];
			int cr = 0;
			for(int i = front; i<maxSize; ++i)
			{
				b[cr++] = values[i];
			}
			for(int i = 0; i<back; ++i)
			{
				b[cr++] = values[i];
			}
			maxSize*=2;
			values = new int [maxSize];
			for(int i = 0; i<size; ++i)
			{
				values[i] = b[i];
			}
			front = 0;
			back = size;
		}
		{
			size++;
			values[back]=a;
			back = (back+1)%maxSize;
		}
	}

	@Override
	public int dequeue() throws Exception {
		if(size == 0)
		{
			throw new Exception ("the queue is empty");
		}
		else
		{ 
			int k = front;
		    size--;
		    front = (front+1)%maxSize;
		    return values[k];
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		size = 0;
		front=  0;
		back = 0;
		values = new int [maxSize];
	}
	
	public int getFront()
	{
		return front;
	}

	public int getBack()
	{
		return back;
	}
	public String toString ()
	{
		String ans = "top[";
		if(back<front)
		{
			for(int i = front; i<maxSize; ++i)
			{
				ans =ans+ ' '+values[i];
			}
			for(int i = 0; i<back; ++i)
			{
				ans =ans+ ' '+values[i];	
			}
		}
		else
		{
			for(int i = front; i<back; ++i)
			{
				ans=ans+' '+values[i];
			}
		}
		return ans+"]bottom";
	}
}
