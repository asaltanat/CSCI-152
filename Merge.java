package queue.impl;

import queue.adt.Deque;

public class Merge {
 
	public static Deque<Integer> merge(Deque<Integer> d1, Deque<Integer> d2) throws Exception {
 /* assuming d1 and d2 are sorted, merge their contents
       into a single sorted Deque, and return it */
       Deque <Integer> res = new LinkedListDeque<Integer>();
       while(d1.getSize()!=0 || d2.getSize()!=0)
       {
    	   if(d1.getSize()==0)
       {
    	   res.pushToBack(d2.popFromFront());
       }
    	   else if(d2.getSize()==0)
       {
    	   res.pushToBack(d1.popFromFront());
       }
    	   else {
    		   int k = d1.popFromFront();
    		   int p = d2.popFromFront();
    		   if(p<=k)
    		   {
    			   res.pushToBack(p);
    			   d1.pushToFront(k);
    		   }
    		   else
    		   {
    			   res.pushToBack(k);
    			   d2.pushToFront(p);
    		   }
    	   }
    	   }
       return res;
   }  
}
