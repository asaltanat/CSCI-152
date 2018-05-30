package queue.impl;

import queue.adt.Queue;

public class TestQueue {
	
	public static void main (String [] args)
	{
		Queue<Integer> queue = new ArrayQueue<Integer>();
		try {

			queue.enqueue(25);
			System.out.println("YEYEYEYEYEY");
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
		} catch (Exception e) {
			queue.enqueue(37);
			System.out.println("NONONONO");
			System.out.println(e.getMessage());
		}
		
		for(int i = 1; i<=8; ++i)
		{
			queue.enqueue(i);
		}
		System.out.println("Size:" + queue.getSize());
		System.out.println(queue);

		try {
			System.out.println(queue.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(queue.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(queue.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Size:" + queue.getSize());
		System.out.println(queue);

		for(int i = 1; i<10; ++i)
		{
			queue.enqueue(i);
			queue.enqueue(-i);
			try {
				System.out.println(queue.dequeue());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println(queue.dequeue());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}	
			System.out.println("Size:" + queue.getSize());
			System.out.println(queue);

		}
		
		queue.clear();
		System.out.println("Size:" + queue.getSize());
		System.out.println(queue);
		for(int i = 1; i<23; ++i)
		{
			queue.enqueue(i);
		}
		
		System.out.println(queue.getSize());
		System.out.println(queue);
		
	}
}
