package queue.impl;

import queue.adt.HashTableSet;

public class LLQHashTableSet <T extends Comparable> implements HashTableSet<T>{
	
	private LinkedListQueue<T>[] buckets;
	private int size;
	
	public LLQHashTableSet(int sz)
	{
		buckets = new LinkedListQueue[sz];
		size = 0;
	}
	@Override
	public void add(T value) {
		if(!this.contains(value)) {
	    int x = (value.hashCode()) % buckets.length;
		x = (x<0 ? -x : x);
		if(buckets[x]==null)
		{
			buckets[x] = new LinkedListQueue<T>();
		}
		buckets[x].enqueue(value);
		size++;
		}
	}

	@Override
	public boolean contains(T value) {
		int x = (value.hashCode())%buckets.length;
		x = (x<0? -x:x);
		if(buckets[x] == null)
			return false;
		int bs = buckets[x].getSize();
		boolean bb = false;
		while((bs--)>0){
			T z;
			try {
				z = buckets[x].dequeue();
				buckets[x].enqueue(z);
				if(z.equals(value))
				{
					bb = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bb;
	}

	@Override
	public boolean remove(T value) throws Exception {
		if(contains(value)) {
			int x = (value.hashCode())%buckets.length;
			x = (x<0? -x:x);
			if(buckets[x] == null)
				return false;
			int bs = buckets[x].getSize();
			while(bs>0)
			{
				bs--;
				T z = buckets[x].dequeue();
				if(!z.equals(value))
				{
					buckets[x].enqueue(z);
				}
			}
			size--;
			return true;
		}
		return false;
	}

	@Override
	public T removeAny() throws Exception {
		T y=null;
		if(size>0) {
			for(int i = 0; i<buckets.length; ++i)
			{
				if(buckets[i].getSize()!=0) {
					size--;
					y= buckets[i].dequeue();
					break;
				}
			}
		}
		else 
		throw new Exception ("This is impossible");

		return y;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		size = 0;
		for(int i = 0; i<buckets.length; ++i)
			buckets[i].clear();
	}
	
	public String bucketToString()
	{
		String ans = "{";
		for(int i = 0; i<buckets.length; ++i)
		{
			ans+="bucket"+ i +": ";
			if(buckets[i] == null)
			{
				return "\n";
			}
			ans+=buckets[i].toString() + "/n";
		}	
		return ans+"}";
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
	public String toString() {
		return bucketToString();
	}
	@Override
	public String bucketsToString() {
		// TODO Auto-generated method stub
		return null;
	}
}
