package queue.impl;

public class TestNode {
	public static void main (String [] args)
	{
	   LinkedListQueue<Integer> myList = new LinkedListQueue<Integer>();
	   
	   try {
		System.out.println(myList.dequeue());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	   for(int i = 1; i<=8; ++i)
	   {
		   myList.enqueue(i);
	   }
		System.out.println(myList);
		System.out.println("Size:" + myList.getSize());
		   try {
				System.out.println(myList.dequeue());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}   try {
				System.out.println(myList.dequeue());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}   try {
				System.out.println(myList.dequeue());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println(myList);
			System.out.println("Size:" + myList.getSize());
			for(int i = 1; i<=9; i++)
			{
			    myList.enqueue(i*3);
			    myList.enqueue(i*3+1);
			    try {
					System.out.println(myList.dequeue());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				} try {
					System.out.println(myList.dequeue());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println(myList);
				System.out.println("Size:" + myList.getSize());
			}
			for(int i = 0; i<22; i++)
			{
				myList.enqueue(i);
			}
		   System.out.println(myList);
		   System.out.println("Size:" + myList.getSize());
	}
}
