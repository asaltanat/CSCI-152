package queue.impl;

@SuppressWarnings("rawtypes")
public class Student implements Comparable{
	private String name;
	private int id;
	
	Student (String name, int id)
	{
		this.setName(name);
		this.setId(id);
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
	
	public boolean equals (Object obj)
	{
		if(obj instanceof Student)
		{
			Student sobj = (Student)obj;
			return id==sobj.id && name.equals(sobj.name);
		}
		return false;
	}
	public String toString ()
	{
		return "["+getName()+";"+getId()+"]";
	}

	public int hashCode() {
		return id;
	}
	@Override
	public int compareTo(Object st) {
		Student s = (Student) st;
		if( id>s.getId())
		return 1;
		
		else if(id<s.getId())
			return -1;
		else
			return 0;
		

		//return name.compareTo(s.getName());
	}
}
