package circularLinkedList;

public class Node {
	
	private int data;
	private Node next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node ()
	{
		this.setData(0);
		this.setNext(null);
	}
	
	public Node (int data)
	{
		this.setData(data);
		this.setNext(null);
	}
	public Node (int data , Node next)
	{
		this.setData(data);
		this.setNext(next);
	}

}
