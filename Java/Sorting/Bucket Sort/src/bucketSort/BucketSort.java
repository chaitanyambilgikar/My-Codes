package bucketSort;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
public class BucketSort {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Random gen = new Random();
		ArrayList<Integer> A = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			A.add(i, gen.nextInt(100));
		}
		ArrayList<BucketList> buckets = new ArrayList<>(n);
		for (int i = 0; i < buckets.size(); i++) {
			buckets.add(i, new BucketList());
		}
		for (int i = 0; i < A.size(); i++) {
			int temp = n*A.get(i);
			buckets.get(i).getbList().add((int)Math.floor(temp));
		}
	}

}
