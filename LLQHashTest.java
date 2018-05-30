package queue.impl;

import queue.adt.Set;

public class LLQHashTest {
	
	public static void main (String [] args)
	{
		Set<Integer> node = new LLQHashTableSet<Integer>(5);

		try {
		System.out.println(node.removeAny());
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		for(int i = 1; i<=20; ++i) {
			node.add(i);
		System.out.println(node.getSize());
		System.out.println(node);
		}
		for(int i = 2; i<=20; i+=2)
		{
			try {
				node.remove(i);
				System.out.println(node.getSize());
				System.out.println(node);
			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
			
		}
		try {
			System.out.println(node.remove(10));
			System.out.println(node.getSize());
			System.out.println(node);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		try {
			System.out.println(node.remove(100));
			System.out.println(node.getSize());
			System.out.println(node);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		for(int i = 1; i<=30; ++i) {
			node.add(i);
		System.out.println(node.getSize());
		System.out.println(node);
		}	
		for(int i = 2; i<=20; i+=2)
		{
			try {
				System.out.println(node.removeAny());
				System.out.println(node.getSize());
				System.out.println(node);
			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
			
		}
		node.clear();
		System.out.println(node.getSize());
		System.out.println(node);
	for(int i = 51; i<=79; i+=2) {
		node.add(i);
	System.out.println(node.getSize());
	System.out.println(node);
	}	
}
}