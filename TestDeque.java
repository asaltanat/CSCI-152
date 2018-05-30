package queue.impl;

import queue.adt.Deque;

public class TestDeque {

	public static void main (String [] args)
	{
		Deque<Integer> a = new LinkedListDeque<Integer>();
		try {
			System.out.println(a.popFromFront());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(a.popFromBack());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for(int i = 1; i<=10; i+=2)
		{
			a.pushToFront(i);
			System.out.println(a);
		}
		try {
			System.out.println(a.popFromFront());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		try {
			System.out.println(a.popFromFront());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		try {
			System.out.println(a.popFromFront());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		try {
			System.out.println(a.popFromFront());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		try {
			System.out.println(a.popFromFront());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for(int i = 0; i<=12; i+=2)
		{
			a.pushToBack(i);
			System.out.println(a);
		}

		try {
			System.out.println(a.popFromBack());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		try {
			System.out.println(a.popFromBack());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		try {
			System.out.println(a.popFromBack());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		try {
			System.out.println(a.popFromBack());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		try {
			System.out.println(a.popFromBack());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		try {
			System.out.println(a.popFromBack());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		for(int i = 1; i<=7; i++)
		{
			a.pushToBack(i);
		}
		for(int i = 1; i<=7; ++i) {
		try {
			System.out.println(a.popFromBack());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		}
		

		for(int i = 1; i<=8; i++)
		{
			a.pushToBack(i);
		}
		for(int i = 1; i<=8; ++i) {
			try {
				System.out.println(a.popFromFront());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(a);
		}
		
		for(int i = 1; i<=10; i++)
		{
			a.pushToFront(i);
			a.pushToBack(i);

			System.out.println(a);
		}

		for(int i = 1; i<=8; i++)
		{
			try {
				System.out.println(a.popFromFront());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println(a.popFromBack());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(a);
			}
		System.out.println(a.getSize());

			a.clear();

			System.out.println(a.getSize());
			
			a.pushToFront(12);
			a.pushToBack(15);

			a.pushToFront(18);
			a.pushToBack(24);

			System.out.println(a);


	}
}
