package queue.impl;

import queue.adt.KeyValuePair;
import queue.adt.Map;

public class BSTMap<K extends Comparable, V> implements Map<K, V> {
	 private TreeNode<KeyValuePair<K,V>> root;
	 private int size;
	 
	 public BSTMap() {
	 root = null;
	 size = 0;
	 }
	 
	 @Override
	 public void define(K key, V value) {
		 //if(checker(key, value, root);
	 }
	 private boolean checker (K k, V v,TreeNode<KeyValuePair<K,V>> node)
	 {
		 if(node == null)
			 return false;
		 if(k.compareTo(node.getLeft().get))
		 
	 }
	 @Override
	 public V getValue(K key) {
	 // TODO Auto-generated method stub
	 return null;
	 }
	 
	 @Override
	 public V remove(K key) {
	 // TODO Auto-generated method stub
	 return null;
	 }
	 
	 @Override
	 public KeyValuePair<K, V> removeAny() throws Exception {
	 // TODO Auto-generated method stub
	 return null;
	 }
	 
	 @Override
	 public int getSize() {
	 return size;
	 }
	 
	 @Override
	 public void clear() {
	 // TODO Auto-generated method stub
	 }
	 
	    @Override
	    public String toString() {
	     // TODO Implement me!
	     return "";
	    }
}
