package countingSort;

import java.util.Random;

public class CountingSort {

	/**
	 * @param args
	 */
	public CountingSort() {
		// TODO Auto-generated constructor stub
	}
	public void printArray(int A[])
	{
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		CountingSort CSort = new CountingSort();
		Random gen = new Random();
		int [] A = new int[n], B = new int[n], C = new int[100];
		for (int i = 0; i < A.length; i++) {
			A[i] = gen.nextInt(100);
			
		}
		CSort.printArray(A);
		//Set C to 0
		for (int j = 0; j < C.length; j++) {
			C[j] = 0;
		}
		//Make C[j] contain the number of elements in A equal to j
		for (int j2 = 0; j2 < A.length; j2++) {
			C[A[j2]] = C[A[j2]] +1;
		}
		//C[i] should now contain number of elements in A <=i
		for (int k = 1; k < C.length; k++) {
			C[k] = C[k] + C[k-1];
		}
		for(int m = A.length - 1;m>=0;m--)
		{
			B[C[A[m]]] = A[m];
			C[A[m]] = C[A[m]] - 1;
		}
		CSort.printArray(B);
	}

}
