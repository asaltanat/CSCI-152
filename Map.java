package queue.adt;

public interface Map<K, V> {
	
	public void define (K key, V value);
	
	public V getValue(K key);
	
	public V remove (K key);
	
	public KeyValuePair <K, V> removeAny() throws Exception;
	
	public int getSize();
	
	public void clear();
	
	public String toString();

}
