package queue.impl;

public class TreeNode <T>{
	
	private T value;
	private TreeNode <T> left;
	private TreeNode <T> right;
	
	
	public TreeNode (T val) {
		setValue(val);
		setLeft(null);
		setRight(null);
	}


	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}


	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}


	/**
	 * @return the left
	 */
	public TreeNode <T> getLeft() {
		return left;
	}


	/**
	 * @param left the left to set
	 */
	public void setLeft(TreeNode <T> left) {
		this.left = left;
	}


	/**
	 * @return the right
	 */
	public TreeNode <T> getRight() {
		return right;
	}


	/**
	 * @param right the right to set
	 */
	public void setRight(TreeNode <T> right) {
		this.right = right;
	}
	
	public String toString ()
	{
		return value.toString();
	}
	
}
