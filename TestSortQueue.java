package queue.impl;

import queue.adt.SortedQueue;

public class TestSortQueue {

	public static void main (String[] args)
	{
		SortedQueue<Integer> a = new LinkedListSortedQueue<Integer>();
		for(int i = 90; i>=10; i-=10) {
		     a.insert(i);
		    System.out.println(a);
		}
		try {
			System.out.println(a.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a.getSize());

		try {
			System.out.println(a.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a.getSize());

		try {
			System.out.println(a.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a.getSize());
		for(int i = 100; i<=900; i+=100)
		{

			a.insert(i);
			System.out.println(a);
		}
		try {
			System.out.println(a.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}try {
			System.out.println(a.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}try {
			System.out.println(a.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}try {
			System.out.println(a.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for(int i = 5; i<=915; i+=10)
		{
			a.insert(i);
			System.out.println(a);
		}
		a.clear();
		System.out.println(a);
		a.insert(5);
		System.out.println(a);
		a.insert(15);
		System.out.println(a);
	
		
		}
}
