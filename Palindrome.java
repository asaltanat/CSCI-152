package queue.impl;

import queue.adt.Queue;
import queue.adt.Stack;

public class Palindrome {
	
	public static boolean isPalindrome(Queue<Character> q) throws Exception {
		Queue <Character> copy = new LinkedListQueue<Character>();
		Stack <Character> use = new LinkedListStack<Character>();
		
		while(q.getSize()>0)
		{
			char c = q.dequeue();
			copy.enqueue(c);
			use.push(c);
		}
		int n = copy.getSize();
		if(n == 0 || n == 1)
		{
			return true;
		}
		while(copy.getSize()>n/2)
		{
			if(copy.dequeue()!=use.pop())
			{
				return false;
			}
		}
		return true;
	}
	public static void main (String [] args)
	{
		Queue <Character> myWord = new LinkedListQueue<Character>();
		myWord.enqueue('a');
		myWord.enqueue('A');
		myWord.enqueue('a');
		//myWord.enqueue('b');
		//myWord.enqueue('a');
		try {
			System.out.println(isPalindrome(myWord));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
