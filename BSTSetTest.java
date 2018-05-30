package queue.impl;

import queue.adt.Set;

public class BSTSetTest {
	
	public static void main (String [] args)
	{
		Set<Integer> node = new BSTSet<Integer>();
		
		try {
			System.out.println("YeahBOOOOOOOY");
			node.remove(0);
		} catch (Exception e) {

			System.out.println("nono");
		}
		System.out.println(node.getSize());
		System.out.println(node);
		
		node.add(5);
		node.add(12);
		node.add(3);
		node.add(6);
		node.add(14);
		node.add(2);
		node.add(-6);
		node.add(8);
		node.add(0);
		System.out.println(node.getSize());
		System.out.println(node);
		node.add(14);
		node.add(-6);
		node.add(5);
		System.out.println(node.getSize());
		System.out.println(node);
		System.out.println(node.contains(12));
		System.out.println(node.contains(7));
		System.out.println(node.contains(2));
		System.out.println(node.contains(-8));
		System.out.println(node.contains(5));
		System.out.println(node.getSize());
		System.out.println(node);

		try {
			node.remove(0);
			node.remove(6);
			node.remove(3);
		} catch (Exception e) {

			System.out.println("nono");
		}
		System.out.println(node.getSize());
		System.out.println(node);
		node.add(6);
		node.add(13);
		node.add(99);
		node.add(11);
		System.out.println(node.getSize());
		System.out.println(node);
		try {
			node.remove(12);
		} catch (Exception e) {

			System.out.println("nono");
		}
		System.out.println(node.getSize());
		System.out.println(node);
		try {
			node.remove(5);
		} catch (Exception e) {

			System.out.println("nono");
		}
		System.out.println(node.getSize());
		System.out.println(node);
		try {
			node.removeAny();
		} catch (Exception e) {

			System.out.println("nono");
		}try {
			node.removeAny();
		} catch (Exception e) {

			System.out.println("nono");
		}try {
			node.removeAny();
		} catch (Exception e) {

			System.out.println("nono");
		}
		System.out.println(node.getSize());
		System.out.println(node);
		node.clear();

		System.out.println(node.getSize());
		System.out.println(node);
		node.add(55);
		node.add(24);
		node.add(78);
		node.add(51);
		System.out.println(node.getSize());
		System.out.println(node);
		
	}
}
