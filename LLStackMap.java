package queue.impl;

import queue.adt.KeyValuePair;
import queue.adt.Map;

public class LLStackMap<K, V> implements Map<K, V> {
	
	private LinkedListStack<KeyValuePair<K, V> > pairs;
	private int size;
	
	public LLStackMap()
	{
		pairs = new LinkedListStack <KeyValuePair<K, V>>();
		size = 0;
	}
	@Override
	public void define(K key, V value) {
		KeyValuePair<K, V> use = new KeyValuePair<K, V>(key, value);
		LinkedListStack<KeyValuePair<K, V>> newst = new LinkedListStack <KeyValuePair<K, V>>();
		boolean add = false;
		for(int i = 0; i<size; i++)
		{
			try {
				KeyValuePair<K, V> pp = pairs.pop();
			if(use.equals(pp))
			{
				newst.push(use);
				add = true;
			}
			else
			{
				newst.push(pp);
			}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(add == false)
		{
			size++;
			newst.push(use);
		}
		int sz = size;
		while(sz>0)
		{
			try {
				pairs.push(newst.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
			sz--;
		}
		}
	@Override
	public V getValue(K key) {
		V val = null;
		LinkedListStack<KeyValuePair<K, V>> newst = new LinkedListStack <KeyValuePair<K, V>>();
		for(int i  = 0; i < size; i++)
		{
			KeyValuePair<K, V> x;
			try {
				x = pairs.pop();
				if(x.getKey()!=key)
				{
					newst.push(x);
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
		int sz = size;
		while(sz>0)
		{
			try {
				pairs.push(newst.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sz--;
		}
		return val;
	}

	@Override
	public V remove(K key) {
		V val = null;
		LinkedListStack<KeyValuePair<K, V>> newst = new LinkedListStack <KeyValuePair<K, V>>();
		int y = size;
		for(int i  = 0; i < y; i++)
		{
			KeyValuePair<K, V> x;
			try {
				x = pairs.pop();
				if(x.getKey()!=key)
				{
					newst.push(x);
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

		int sz = size;
		while(sz>0)
		{
			try {
				pairs.push(newst.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sz--;
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
			return pairs.pop();
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		pairs = new LinkedListStack<KeyValuePair<K, V>>();
		size = 0;
	}
	
	public String toString()
	{
		LinkedListStack<KeyValuePair<K, V>> newst = new LinkedListStack <KeyValuePair<K, V>>();
		String ans = "";
		for(int j = 0; j<size; j++)
		{
			
			try {
				KeyValuePair<K, V> x = pairs.pop();
				newst.push(x);
				ans = ans + x.toString() + "\n";
			} catch (Exception e) {
				return "nothing";
			}
		}

		int sz = size;
		while(sz>0)
		{
			try {
				pairs.push(newst.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sz--;
		}
		return ans;
	}
	
}
