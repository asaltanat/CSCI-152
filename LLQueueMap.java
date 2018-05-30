package queue.impl;

import queue.adt.KeyValuePair;
import queue.adt.Map;

public class LLQueueMap<K, V> implements Map<K, V> {
	
	private LinkedListQueue<KeyValuePair<K, V> > pairs;
	private int size;
	
	public LLQueueMap()
	{
		pairs = new LinkedListQueue<KeyValuePair<K, V>>();
		size = 0;
	}
	@Override
	public void define(K key, V value) {
		KeyValuePair<K, V> use = new KeyValuePair<K, V>(key, value);
		boolean add = false;
		for(int i = 0; i<size; i++)
		{
			try {
				KeyValuePair<K, V> pp = pairs.dequeue();
			if(use.equals(pp))
			{
				pairs.enqueue(use);
				add = true;
			}
			else
			{
				pairs.enqueue(pp);
			}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(add == false)
		{
			size++;
			pairs.enqueue(use);
		}
		}
	@Override
	public V getValue(K key) {
		V val = null;
		for(int i  = 0; i < size; i++)
		{
			KeyValuePair<K, V> x;
			try {
				x = pairs.dequeue();
				if(x.getKey()!=key)
				{
					pairs.enqueue(x);
				}
				else
				{
					val = x.getValue();
					size--;
				}
			} catch (Exception e) {
				return null;
			}
		}
		return val;
	}

	@Override
	public V remove(K key) {
		V val = null;
		for(int i  = 0; i < size; i++)
		{
			KeyValuePair<K, V> x;
			try {
				x = pairs.dequeue();
				if(x.getKey()!=key)
				{
					pairs.enqueue(x);
				}
				else
				{
					val = x.getValue();
					size--;
				}
			} catch (Exception e) {
				return null;
			}
		}
		return val;
	}

	@Override
	public KeyValuePair<K, V> removeAny() throws Exception {
		if (size == 0)
		{
			throw new Exception ("This is empty");
		}
		else
		{
			size--;
			return pairs.dequeue();
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		pairs = new LinkedListQueue<KeyValuePair<K, V>>();
		size = 0;
	}
	
	public String toString()
	{
		String ans = "";
		for(int j = 0; j<size; j++)
		{
			
			try {
				KeyValuePair<K, V> x = pairs.dequeue();
				pairs.enqueue(x);
				ans = ans + x.toString() + "\n";
			} catch (Exception e) {
				return "nothing";
			}

		}
		return ans;
	}
	
}
