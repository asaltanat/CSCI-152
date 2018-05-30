package queue.impl;

public class HashSetStudentTest {


	public static void main (String [] args)
	{
		LLQHashTableSet<Student> set =new LLQHashTableSet<Student>(10);
		
		for(int i = 101; i<=200; ++i)
		{

			set.add(new Student("Bob",i));
		}

		System.out.println(set);
		System.out.println(set.getLoadFactor());
		System.out.println(set.getBucketSizeStandardDev());
		/*
		 When 10
		  10.0
          28.460498941515414
		 */
		/*
		 When 100
		1.0
        9.9
        when 10 with id
        10.0
        0.0
        when 100 with id
        1.0
        0.0
        
        BST when 10 and 42:
        10.0
        28.460498941515414
        
        BST when 100 asnd 42:
        1.0
        9.9
        
        BST when id:
        10:
        10.0
        0.0
        100: 
        1.0 
        0.0
		 */
			}

}
