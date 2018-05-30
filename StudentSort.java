package queue.impl;

@SuppressWarnings("rawtypes")
public class StudentSort implements Comparable
{

	private int id;
	private String name;

	public StudentSort ()
	{

		setId(0);
		setName("");
	}
	public StudentSort (int i, String n)
	{

		setId(i);
		setName(n);
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object st) {
		StudentSort s =(StudentSort)st;
	/*	if( id>s.getId())
		return 1;
		
		else if(id<s.getId())
			return -1;
		else
			return 0;
	*/		
		return name.compareTo(s.getName());
	}
	
	public String toString()
	{
		return name+" "+id;
	}
}
