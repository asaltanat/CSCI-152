package queue.impl;

public class TreeTest {
	public static void main (String [] args) {
		TreeNode<Integer> node = new TreeNode<Integer>(12);
		
		node.setLeft(new TreeNode<Integer>(25));
		node.setRight(new TreeNode<Integer>(17));
		node.getLeft().setLeft(new TreeNode<Integer>(85));
		node.getRight().setLeft(new TreeNode<Integer>(-46));
		node.getRight().setRight(new TreeNode<Integer>(15));
		printTree(node);
	}
	
	public static void printTree(TreeNode<Integer> node)
	{
		if(node == null)
		{
			return;
		}
		System.out.println(node.getValue() + " ");
		
		printTree(node.getLeft());
		printTree(node.getRight());
	}
}
