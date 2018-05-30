package queue.impl;

public class TestLLQMap {

	public static void main (String[] args)
	{
		LLStackMap<Integer, String>map = new LLStackMap<Integer, String>();
		
		try {
			System.out.println(map.removeAny());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		map.define(1, "One");
		map.define(2, "Two");
		map.define(3, "Three");
		map.define(4, "Four");
		map.define(5, "Five");
		System.out.println(map);
		System.out.println(map.getSize());
		System.out.println(map.remove(2));
		System.out.println(map);
		System.out.println(map.getSize());
		System.out.println(map.remove(6));
		System.out.println(map);
		System.out.println(map.getSize());
		map.define(1, "First");
		map.define(3, "Second");
		System.out.println(map);
		System.out.println(map.getSize());
		map.define(6, "Six");
		map.define(2, "Two");
		map.define(7, "Seven");

		System.out.println(map);
		System.out.println(map.getSize());

		System.out.println("*********************");
		try {
			System.out.println(map.removeAny());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("*********************");
		try {
			System.out.println(map.removeAny());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}

		System.out.println("*********************");
		System.out.println(map);
		System.out.println(map.getSize());
		map.clear();
		System.out.println(map);
		System.out.println(map.getSize());
		map.define(6, "Six");
		map.define(2, "Two");
		System.out.println(map);
		System.out.println(map.getSize());
		
	}
}
