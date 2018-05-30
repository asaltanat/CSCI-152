package queue.impl;

import queue.adt.Deque;

public class MergeSort extends Merge {
	public static Deque<Integer> mergeSort(Deque<Integer> deq) throws Exception {
		if(deq.getSize()<=1)
		{
			return deq;
		}
		else if(deq.getSize() == 2)
		{
			int a = deq.popFromBack();
			int b = deq.popFromBack();
			if(a<b)
			{
				deq.pushToFront(b);
				deq.pushToFront(a);
			}
			else
			{
				deq.pushToFront(a);
			    deq.pushToFront(b);
			}
			return deq;	
		}
		else
		{
			int n = deq.getSize()/2;
		    Deque <Integer> d1 = new LinkedListDeque<Integer>();
		    Deque <Integer> d2 = new LinkedListDeque<Integer>();
		    while(deq.getSize()>n)
		    {
		    	d1.pushToBack(deq.popFromBack());
		    }
		    while(deq.getSize()>0)
		    {
		    	d2.pushToBack(deq.popFromBack());
		    }
		    d1 = mergeSort(d1);
		    d2 = mergeSort(d2);
		    deq = merge(d1, d2);
		    return deq;
		}
	} 
	
	public static void main (String [] args)
	{
	    Deque <Integer> d1 = new LinkedListDeque<Integer>();
		d1.pushToBack(5);
		d1.pushToBack(9);
		d1.pushToBack(3);
		d1.pushToBack(12);
		d1.pushToBack(89);
		d1.pushToBack(5);
		d1.pushToBack(0);
		d1.pushToBack(11);
		try {
			d1  = mergeSort(d1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(d1);
		System.out.println(d1.getSize());
	}
}
