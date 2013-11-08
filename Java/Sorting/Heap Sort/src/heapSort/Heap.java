package heapSort;

public class Heap {

	private int[] heap; 
	public int[] getHeap() {
		return heap;
	}
	public void setHeap(int[] heap) {
		this.heap = heap;
	}
	public int getHeapSize() {
		return heapSize;
	}
	public void setHeapSize(int heapSize) {
		this.heapSize = heapSize;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	private int heapSize;
	private int length;
	
	public Heap() {
		this.setHeap(new int[]{4,2,6,4,8,5,9,1,8,7,4,6,0,1,2,3,5,9,1});
		this.setHeapSize(this.getHeap().length);
		this.setLength(this.getHeap().length);
	}
	
}
