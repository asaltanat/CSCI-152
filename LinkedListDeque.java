package queue.impl;

import queue.adt.Deque;

public class LinkedListDeque <T> implements Deque<T>{

	private DoublyLinkedNode<T> front;
	private DoublyLinkedNode<T> back;
	
	private int size;
	
	LinkedListDeque()
	{
		front = null;
		back = null;
		size=0;
	}
	
	@Override
	public void pushToFront(T value) {
		DoublyLinkedNode <T> newnode = new DoublyLinkedNode <T>(value);
		if(size == 0)
		{
			front = newnode;
			back = newnode;
		}
		else
		{
			newnode.setNext(front);
			front.setPrevious(newnode);
			front = newnode;
		}
		size++;
	}

	@Override
	public void pushToBack(T value) {
		DoublyLinkedNode <T> newnode = new DoublyLinkedNode<T>(value);
		if(size == 0)
		{
			front = newnode;
			back = newnode;
		}
		else
		{
			newnode.setPrevious(back);
			back.setNext(newnode);
			back = newnode;
		}
		size++;
	}

	@Override
	public T popFromFront() throws Exception {
		if(size == 0)
		{
			throw new Exception("This is empty");
		}
		else
		{
		if(size == 1)
		{
			T res = front.getValue();
			front = null;
			back = null;
			size = 0;
			return res;
		}
		else {
			size--;
			T res = front.getValue();
		front.getNext().setPrevious(null);
		front = front.getNext();
		return res;
		}
		}
	}

	@Override
	public T popFromBack() throws Exception {
		if(size == 0)
		{
			throw new Exception("This is Empty");
		}
		else
		{
			if(size== 1)
			{
				T res = front.getValue();
				front = null;
				back = null;
				size = 0;
				return res;
			}
			else
			{
				size--;
				 T res = back.getValue();
				back.getPrevious().setNext(null);
				back = back.getPrevious();
				return res;
				}
			}
			}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		size = 0;
		front = null;
		back = null;
	}
	public String toString ()
	{
		String ans="";
		DoublyLinkedNode <T> newnode = front;
		while(newnode!=null)
		{
			ans= ans+" "+newnode.getValue();
			newnode = newnode.getNext();
		}
		return ans;
}
}