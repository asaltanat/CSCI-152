package queue.adt;

public class KeyValuePair<K, V> {
	
	private K key;
	private V value;
	
	public KeyValuePair(K key, V value)
	{
		this.key = key;
		this.setValue(value);
	}
	
	public K getKey ()
	{
		return key;
	}
	public void setKey(K key)
	{
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}
	
	public boolean equals(Object val)
	{
		if(val instanceof KeyValuePair)
		{
			KeyValuePair<K, V> val2 = (KeyValuePair<K, V>) val;
			return key==val2.key;
		}
		
		return false;
	}
	public String toString ()
	{
		return "<"+key+", "+value+">";
	}
}

