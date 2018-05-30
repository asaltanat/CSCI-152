package queue.impl;

import queue.adt.Set;

public class SetStudentTest {


	public static void main (String [] args)
	{
		Set<Student> a =new LLQueueSet<Student>();
		
		try {
			System.out.println(a.removeAny());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		Student s1 = new Student("A", 25);
		Student s2 = new Student("B", 35);
		Student s3 = new Student("C", 45);
		Student s4 = new Student("D", 55);
		Student s5 = new Student("E", 55);
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		System.out.println(a);
		System.out.println("Size:" + a.getSize());

		Student s6 = new Student("B", 35);
		try {
			System.out.println(a.remove(s6));
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		System.out.println(a);
		System.out.println("Size:" + a.getSize());

		Student s7 = new Student("W", 95);
		try {
			System.out.println(a.remove(s7));
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		System.out.println(a);
		System.out.println("Size:" + a.getSize());
		
		Student s8 = new Student("D", 55);
		Student s9 = new Student("C", 45);
		
		a.add(s8);
		a.add(s9);

		System.out.println(a);
		System.out.println("Size:" + a.getSize());
		
		Student s10 = new Student("X", 77);
		Student s11 = new Student("Y", 87);
		Student s12 = new Student("Z", 97);
		a.add(s10);
		a.add(s11);
		a.add(s12);

		System.out.println(a);
		System.out.println("Size:" + a.getSize());

		try {
			System.out.println(a.removeAny());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(a);
		System.out.println("Size:" + a.getSize());
		try {
			System.out.println(a.removeAny());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(a);
		System.out.println("Size:" + a.getSize());
		a.clear();
		System.out.println(a);
		System.out.println("Size:" + a.getSize());
		Student s14 = new Student("ss", 87);
		Student s15 = new Student("pp", 97);
		a.add(s14);
		a.add(s15);
		System.out.println(a);
		System.out.println("Size:" + a.getSize());
		

	}

}
