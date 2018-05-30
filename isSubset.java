package queue.impl;

import queue.adt.Set;

public class isSubset {

   public static boolean isSubSet(Set<Integer> set1, Set<Integer> set2) {
	   boolean f = true;
	   Set <Integer> p = new LLQueueSet<Integer>();
	   while(set1.getSize()>0)
	   {
		   int x;
		try {
			x = set1.removeAny(); p.add(x);
			   if(!set2.contains(x))
			   {
				   f = false;
			   }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   while(p.getSize()>0)
	   {
		   try {
			set1.add(p.removeAny());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   return f;
   }
   
   public static void main (String [] args)
   {
	   Set<Integer> a =new LLQueueSet<Integer>();
	   Set<Integer> b =new LLQueueSet<Integer>();
	   Set<Integer> c =new LLQueueSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(10);
		c.add(22);
		c.add(23);
		for(int i = 0; i<10; ++i)
		{
			b.add(i);
		}
		
		System.out.println(isSubSet(a, b));
   }
}
