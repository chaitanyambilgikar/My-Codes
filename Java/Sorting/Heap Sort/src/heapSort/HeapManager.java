package heapSort;

public class HeapManager {
	
	private Heap heap;
	
	public Heap getHeap() {
		return heap;
	}
	public void setHeap(Heap heap) {
		this.heap = heap;
	}
	public int parent(int i)
	{
		if(i==0||i==1)
		{
			return 0;
		}
		else
		{
			return (int)Math.floor(i/2);
		}
		
	}
	public int left(int i)
	{
		if(i==0)
		{
			return 1;
		}
		else
		{
			return (2*i) +1;
		}
	
	}
	public int right(int i)
	{
		if(i==0)
		{
			return 2;
		}
		else
		{
			return 2*i;
		}
		
	}
	
	
	public void maxHeapify(Heap A, int i)
	{
		int left = left(i);
		int right = right(i);
		int largest;
		if (left < A.getLength() && A.getHeap()[left] > A.getHeap()[i])
		{
			largest = left;
		}
		else
		{
			largest = i;
		}
		
		if(right< A.getLength() && A.getHeap()[right] > A.getHeap()[largest])
		{
			largest = right;
		}
		if(largest != i)
		{
			int swapTemp = A.getHeap()[i];
			A.getHeap()[i] = A.getHeap()[largest];
			A.getHeap()[largest] = swapTemp;
			maxHeapify(A, largest);
		}
	}
	
	public void buildHeap(Heap A)
	{
		A.setHeapSize(A.getLength()-1);
		for(int i = (int)Math.floor(A.getHeapSize()/2); i>=0; i--)
		{
			maxHeapify(A, i);
		}
	}
	
	public void heapSort(Heap A)
	{
		buildHeap(A);
		for ( int i = A.getLength()-1; i>0; i--)
		{
			int swapTemp = A.getHeap()[0];
			A.getHeap()[0] = A.getHeap()[i];
			A.getHeap()[i] = swapTemp;
			int tempSize = A.getHeapSize();
			--tempSize;
			A.setHeapSize(tempSize);
			maxHeapify(A, 0);
		}
	}
	public void printHeap(Heap A)
	{
		for(int i = 0; i<A.getLength();i++)
		{
			System.out.print(A.getHeap()[i]+" ");
		}
		System.out.println();
	}
	public HeapManager() {
		this.setHeap(new Heap());
		printHeap(this.getHeap());
		heapSort(this.getHeap());
		printHeap(this.getHeap());
	}

}
