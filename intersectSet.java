package queue.impl;

import queue.adt.Set;

public class intersectSet {

	public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
	   Set <Integer> p = new LLQueueSet<Integer>();
	   for(int i = 0; i<set1.getSize(); ++i)
	   {
		   int x;
		   try {
			x = set1.removeAny();
			set1.add(x);
			if(set2.contains(x))
			{
				   p.add(x);
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   return p;
   }
   
   public static void main (String [] args)
   {
	   Set<Integer> a =new LLQueueSet<Integer>();
	   Set<Integer> b =new LLQueueSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		b.add(1);
		b.add(2);
		b.add(5);
		System.out.println(intersection(a, b));
   }
}
