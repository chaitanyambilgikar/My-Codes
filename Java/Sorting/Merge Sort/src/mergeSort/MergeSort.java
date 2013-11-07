package mergeSort;

public class MergeSort {
	
	
	public int[] A = {10,15,1,4,6,7,2,5,9,11};
	
	public void print()
	{
		for(int i=0;i<this.A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public MergeSort() {
		
		print();
		Merge_Sort(this.A, 0, A.length-1);
		print();
	}
	
	public void Merge_Sort(int[] A,int p, int r)
	{
		if (p<r)
		{
			int q = (int) Math.floor((p+r)/2);
			Merge_Sort(A, p, q);
			Merge_Sort(A, q+1, r);
			Merge(A,p,q,r);
		}
	}
	
	public void Merge(int[] A,int p, int q, int r)
	{
		int n1 = q-p+1;
		int n2 = r-q;
		int[] left = new int[n1+1];
		int[] right = new int[n2+1];
		for (int i=0;i<n1;i++)
		{
			left[i] = A[p+i];
		}
		for(int j=0;j<n2;j++)
		{
			right[j] = A[q+j];
		}
		left[n1] = 999;
		right[n2] = 999;
		
		int i=0,j=0;
		
		for(int k=p;k<=r;k++)
		{
			if(left[i]<=right[j])
			{
				A[k] = left[i];
				i++;
			}
			else
			{
				A[k] = right[j];
				j++;
			}
		}
	}
	
}