package queue.impl;

import java.util.Random;

public class LLQHashTest2 {

public static void main(String[] args) {
     
     BSTHashTableSet<Integer> set = new BSTHashTableSet<Integer>(10);
 
     System.out.println("Starting timing tests...");
     long time1, time2, duration;

     Random rand = new Random();
     time1 = System.currentTimeMillis();
     
     for (int i = 0; i < 500000; i++) {
    	 int  x = rand.nextInt(500000);
    	// System.out.println(x);
          set.add(x);
     }
   
     time2 = System.currentTimeMillis();
     duration = time2 - time1;
 
     System.out.println("Time taken in ms: " + duration);
     System.out.println(set.getLoadFactor());
     System.out.println(set.getBucketSizeStandardDev());
}
}
// testing one
/*Starting timing tests...
Time taken in ms: 243750
50000.0
0.0
Starting timing tests...
Time taken in ms:246550
50000.0
0.0
Starting timing tests...
Time taken in ms: 251117
50000.0
0.0
second:
Starting timing tests...
Time taken in ms: 24239
5000.0
0.0
Starting timing tests...
Time taken in ms: 96508
5000.0
0.0
Starting timing tests...
Time taken in ms: 133076
5000.0
0.0
third:
Starting timing tests...
Time taken in ms: 2741
100.0
0.0
Starting timing tests...
Time taken in ms: 2897
100.0
0.0
Starting timing tests...
Time taken in ms: 2716
100.0
0.0
*/
/*
 BST 5000:
 Time taken in ms: 6304
100.0
0.0
Starting timing tests...
Time taken in ms: 699
100.0
0.0
Starting timing tests...
Time taken in ms: 698
100.0
0.0
BST 100:
Starting timing tests...
Time taken in ms: 125802
5000.0
0.0
Starting timing tests...
Time taken in ms: 119088
5000.0
0.0
Starting timing tests...
Time taken in ms: 123669
5000.0
0.0
BST 10:
1356325

Random LLQ 5000:
Time taken in ms: 5122
63.0
4.7683120703242565
100
Starting timing tests...
Time taken in ms: 82128
3160.0
34.14732786031727
10
Time taken in ms: 178252
31645.0
86.15625340043519
BTS: 5000
Time taken in ms: 479
63.0
4.793558177387649
100:
Time taken in ms: 592
3159.0
32.99151406043681
10:
Time taken in ms: 712
31643.0
101.42682091044755
 */