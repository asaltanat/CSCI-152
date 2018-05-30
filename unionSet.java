package queue.impl;

import queue.adt.Set;

public class unionSet {

	public static Set<String> union(Set<String> set1, Set<String> set2){
	   Set <String> p = new LLQueueSet<String>();
	   for(int i = 0; i<set2.getSize(); ++i)
	   {
		   String s;
		try {
			s = set2.removeAny();
			   p.add(s);
			   set2.add(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   }
	   for(int i = 0; i<set1.getSize(); ++i)
	   {
		   String x;
		   try {
			x = set1.removeAny();
			set1.add(x);
			   if(!p.contains(x))
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
	   Set<String> a =new LLQueueSet<String>();
	   Set<String> b =new LLQueueSet<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		b.add("c");
		b.add("b");
		b.add("a");
		System.out.println(union(a, b));
   }
}
