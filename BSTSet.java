package queue.impl;

import queue.adt.Set;

@SuppressWarnings("rawtypes")
public class BSTSet <T extends Comparable> implements Set<T>{

	private TreeNode <T> root;
	private int size;
	
	public BSTSet()
	{
		root = null;
		size = 0;
	}
	@Override
	public void add(T value) {
		if(!contains(value)) {
			root = addHelp(root, value);
			size++;
		}
	}

	@SuppressWarnings("unchecked")
	private TreeNode<T> addHelp(TreeNode<T> node, T value)
	{
		if(node == null)
		{
			node = new TreeNode<T>(value);
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
	private boolean checkIt(TreeNode <T> node, T value)
	{
		if(node == null)
		{
			return false;
		}
		if((value.compareTo(node.getValue()))  == 0)
		return true;
		else
		if((value.compareTo(node.getValue()))>0)
		{
			return checkIt(node.getRight(), value);
		}
		else if((value.compareTo(node.getValue()))<0){
			return checkIt(node.getLeft(), value);
		}
		return true;
     }

	@Override
	public boolean remove(T value){
		if(contains(value) && size>0)
		{
			TreeNode <T> node = root;
			TreeNode <T> upnode = null;
			while(node!=null)
			{

				if(node.getValue().compareTo(value)>0)
				{
					upnode = node;
					node = node.getLeft();
				}
				else
				if(node.getValue().compareTo(value)<0)
				{
					upnode = node;
					node = node.getRight();
				}
				else
				if(node.getValue().equals(value))
				{
					if(node.getLeft() == null && node.getRight() == null)
					{
						if(upnode == null) {
							root = null;
						}
						else {
						if(node.getValue().compareTo(upnode.getValue()) >=0)
						{
							upnode.setRight(null);
						}
						else
						{
							upnode.setLeft(null);
						}
						}
						size--;
						return true;
					}
// one child: Left
					if(node.getRight()== null)
					{
						if(upnode == null)
						{
							root = node.getLeft();
						}
						else
						{
						if(node.getValue().compareTo(upnode.getValue())>=0)
						{
							upnode.setRight(node.getLeft());
						}
						else
						{
							upnode.setLeft(node.getLeft());
						}}
						size--;
						return true;
					}
// one Child: Right
					if(node.getLeft()== null)
					{
						if(upnode == null)
						{
							root = node.getRight();
						}
						else {
						if(node.getValue().compareTo(upnode.getValue())<0)
						{
							upnode.setLeft(node.getRight());
						}
						else
						{
							upnode.setRight(node.getRight());
						}
						}
						size--;
						return true;
					}
// two child
				if(node.getLeft()!=null && node.getRight()!=null)
				{
					TreeNode <T> upp = node;
					TreeNode <T> ans = node.getRight();
					if(ans.getLeft() == null)
					{
						node.setValue(ans.getValue());
						node.setRight(ans.getRight());
						size--;
						return true;
					}
					while(ans.getLeft()!=null)
					{
						upp = ans;
						ans = ans.getLeft();
					}
					if(ans.getLeft() == null)
					{
						node.setValue(ans.getValue());
						if(ans.getRight() == null)
						{	
							upp.setLeft(null);
						}
						else
						{
							upp.setLeft(ans.getRight());
						}
						size--;
						return true;						
					}
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
			T x =root.getValue(); 
			remove(x); 
			return x; 
		}
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
	
	public String toString ()
	{
		return toStringHelper(root);
	}
	private String toStringHelper(TreeNode<T> node)
	{
		if(node == null)
		{
			return "";
		}
		return toStringHelper(node.getLeft()) + " " + 
				node.getValue()+ " "+ 
				toStringHelper(node.getRight())+ " ";
	}

}
