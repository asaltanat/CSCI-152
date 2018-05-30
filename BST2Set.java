package queue.impl;

import queue.adt.Set;

@SuppressWarnings("rawtypes")
public class BST2Set <T extends Comparable> implements Set<T>{

	private OnOffTreeNode <T> root;
	private int size;
	
	public BST2Set()
	{
		root = null;
		size = 0;
	}
	@Override
	public void add(T value) {
		if(checkActive(root, value) == false)
		{
			if(size == 0) 
			{
				root = new OnOffTreeNode<T>(value);
				root.setActive(true);
				size++;
			}
			else
			{
				if(!contains(value)) {
					root = addHelp(root, value);
					size++;
				}
				else {
					turnOn(root, value);
				}
			}
		}
		
	}
	@SuppressWarnings("unchecked")
	private OnOffTreeNode<T> addHelp(OnOffTreeNode<T> node, T value)
	{
		
		if(node == null)
		{
			node = new OnOffTreeNode<T>(value);
			node.setActive(true);
			return node;
		}
		if((value.compareTo(node.getValue()))>0)
		{
				node.setRight(addHelp(node.getRight(), value));
		}
		else if((value.compareTo(node.getValue()))<0)
		{
				node.setLeft(addHelp(node.getLeft(), value));
		}
		return node;
	}

	@Override
	public boolean contains(T value) {
		if(root == null)
			return false;
		return checkIt(root, value);
	}
	@SuppressWarnings("unchecked")
	private boolean checkIt(OnOffTreeNode <T> node, T value)
	{
		if(node == null)
		{
			return false;
		}
		if((value.compareTo(node.getValue()))>0)
		{
			return checkIt(node.getRight(), value);
		}
		else if((value.compareTo(node.getValue()))<0){
			return checkIt(node.getLeft(), value);
		}
		if((value.equals(node.getValue())));
		{		return true;
		} 
		}
	@Override
	public boolean remove(T value) throws Exception {
		if(contains(value) && size>0)
		{
			OnOffTreeNode <T> node = root;
			if(checkActive(root, value))
			{
			while(node!=null)
			{

				if(node.getValue().compareTo(value)>0)
				{
					node = node.getLeft();
				}
				else
				if(node.getValue().compareTo(value)<0)
				{
					node = node.getRight();
				}
				else
				if(node.getValue().equals(value))
				{
					node.setActive(false);
					size--;
					return true;
				}
			}
			}
		}
	return false;
	}
	@Override
	public T removeAny() throws Exception {
		if(root == null || size == 0)
		{
			throw new Exception("This is empty");
		}
		else
		{
			T x =removeAnyHelper(root);
			return x; 
		}
	}
	private T removeAnyHelper(OnOffTreeNode <T> node)
	{
		if(node == null)
			return null;
		if(node.isActive())
		{
			node.setActive(false);
			size--;
			return node.getValue();
		}
		T rnode = removeAnyHelper(node.getLeft());
		if(rnode !=null)
		{
			return rnode;
		}
		else
			return removeAnyHelper(node.getRight());
	}
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		root = null;
		size = 0;
	}
	
	private boolean checkActive(OnOffTreeNode <T> node, T value)
	{
		if(node == null)
			return false;
		else
		{
			boolean ans;
			if(value.compareTo(node.getValue())<0)
			{
				ans = checkActive(node.getLeft(), value);
			}
			else
				if(value.compareTo(node.getValue())>0)
				{
					ans = checkActive(node.getRight(), value);
				}
			else
					return node.isActive();
			return ans;
		}
					
	}
	private void turnOn(OnOffTreeNode<T> node, T value)
	{
		if(node.getValue().equals(value))
		{
			node.setActive(true);
			size++;
			return;
		}
		if(value.compareTo(node.getValue())>0)
		{
			turnOn(node.getRight(), value);
		}
		else
		{
			turnOn(node.getLeft(), value);
		}
	}
	public String toString ()
	{
		return toStringHelper(root);
	}
	private String toStringHelper(OnOffTreeNode<T> node)
	{
		if(node == null)
		{
			return "";
		}
		if(node.isActive()==false)
		{
			return toStringHelper(node.getLeft()) + toStringHelper(node.getRight());
		}
		return toStringHelper(node.getLeft()) + " " + 
				node.getValue()+ " "+ 
				toStringHelper(node.getRight())+ " ";
	}
}
