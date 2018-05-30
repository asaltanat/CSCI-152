package queue.impl;

import queue.adt.Queue;

public class StudentTest {
	
	public static void main (String [] args)
	{
		Queue<StudentSort> ar = new LinkedListQueue<StudentSort>();
		StudentSort a = new StudentSort(258, "C");
		StudentSort b = new StudentSort(258, "B");
		StudentSort c = new StudentSort(259, "A");
	///	ar.insert(a);
		//ar.insert(b);
		//ar.insert(c);
		System.out.println(ar);
	//	System.out.println(a.compareTo(c));
	}
}
