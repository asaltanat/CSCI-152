package queue.adt;

public interface HashTableStats {

	
	 public int getNumberOfBuckets();
	 
	 public int getBucketSize (int index)throws Exception;
	 
	 public double getLoadFactor();
	 
	 public double getBucketSizeStandardDev();
	
	 public String bucketsToString();
}
