package queue.impl;

import queue.adt.HashTableSet;

@SuppressWarnings("rawtypes")
public class BSTHashTableSet <T extends Comparable> implements HashTableSet<T>{

	private BSTSet<T>[] buckets;
	private int size; 
	
	public BSTHashTableSet(int numBuckets)
	{
		buckets = new BSTSet[numBuckets];
		size = 0;
	}
	@Override
	public void add(T value) {
		if(!this.contains(value)) {
			int x = (value.hashCode())%buckets.length;
			x=(x<0 ? -x : x);
			if(buckets[x] == null)
			{	buckets[x] = new BSTSet<T>();
			}
			buckets[x].add(value);
			size++;
		}
	}

	@Override
	public boolean contains(T value) {
		int x = (value.hashCode())%buckets.length;
		x=(x<0 ? -x : x);
		if(buckets[x] == null)
			return false;	
		return buckets[x].contains(value);
	}
	@Override
	public boolean remove(T value) throws Exception {
		if(contains(value) && size>0)
		{
			int x = (value.hashCode())%buckets.length;
			x=(x<0 ? -x : x);
			size--;
			return buckets[x].remove(value);
		}
		return false;
	}
	@Override
	public T removeAny() throws Exception {
		for(int i = 0; i<buckets.length; ++i)
		{
			if(buckets[i] != null)
			{
				size--;
				return buckets[i].removeAny();
			}
		}
		throw new Exception ("There is nothing to remove");
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		for(int i = 0; i<buckets.length; ++i)
		{
			buckets[i].clear();
		}
		size = 0;
	}
	
	public String toString ()
	{
		String ans = "haha";
		for(int i = 0; i<buckets.length; ++i)
		{
			if(buckets[i] == null)
				return " \n";
			ans = ans+buckets[i].toString()+"\n";
		}
		return ans;
	}
	@Override
	public int getNumberOfBuckets() {
		return buckets.length;
	}
	@Override
	public int getBucketSize(int index) throws Exception {
		if(index<0 || index>=buckets.length || buckets[index] == null)
		{
			throw new Exception ("This does not exist");
		}
		else
		return buckets[index].getSize();
	}
	@Override
	public double getLoadFactor() {
		return size/buckets.length;
	}
	@Override
	public double getBucketSizeStandardDev() {
		int k = size/buckets.length;
		double p = 0;
		for(int i = 0; i<buckets.length; ++i)
		{
			if(buckets[i]!=null)
			{
				p+=(buckets[i].getSize()-k)*(buckets[i].getSize()-k);
			}
		}
		p = Math.sqrt(p/buckets.length);
		return p;
	}
	@Override
	public String bucketsToString() {
		return toString();
	}
}
