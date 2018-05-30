package queue.impl;

public class OnOffTreeNode <T>{
	
	private T value;
	private OnOffTreeNode <T> left;
	private OnOffTreeNode <T> right;
	private boolean active;
	
	public OnOffTreeNode (T val) {
		setValue(val);
		setLeft(null);
		setRight(null);
		setActive(false);
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
	public OnOffTreeNode <T> getLeft() {
		return left;
	}


	/**
	 * @param left the left to set
	 */
	public void setLeft(OnOffTreeNode <T> left) {
		this.left = left;
	}


	/**
	 * @return the right
	 */
	public OnOffTreeNode <T> getRight() {
		return right;
	}


	/**
	 * @param right the right to set
	 */
	public void setRight(OnOffTreeNode <T> right) {
		this.right = right;
	}
	
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	public String toString ()
	{
		return value.toString();
	}
	
}
