package reutrnNthToLastElement;

import java.util.LinkedList;

public class LinkedListManager {

	private LinkedList<Integer> linkedList;

	public LinkedList<Integer> getLinkedList() {
		return linkedList;
	}

	public void setLinkedList(LinkedList<Integer> linkedList) {
		this.linkedList = linkedList;
	}
	public void createLinkedList(int n)
	{
		for(int i=0;i<n;i++)
		{
			this.getLinkedList().add(i+13);
		}
	}

	public void printLinkedList()
	{
		for (int i=0;i<this.getLinkedList().size();i++)
		{
			System.out.print(this.getLinkedList().get(i)+ " ");
		}
		System.out.println();
	}
	
	public int getNthElementFromLast(int n)
	{
		int p1 = 0,p2=0;
		for(int i = 0;i<n;i++)
		{
			if(p2>this.getLinkedList().size())
			{
				System.out.println("REQUESTED ITEM OUT OF RANGE");
				return -1;
			}
			else
			{
				p2++;
			}
		}
		if(p2>this.getLinkedList().size())
		{
			System.out.println("REQUESTED ITEM OUT OF RANGE");
			return -1;
			
		}
		for(;p2<this.getLinkedList().size();p2++)
		{
			p1++;
		}
		System.out.println("P1: "+p1+ " ELEMENT: "+this.getLinkedList().get(p1));
		return p1;
	}
	
	public LinkedListManager(int n,int k) {
		
		this.setLinkedList(new LinkedList<Integer>());
		this.createLinkedList(n);
		this.printLinkedList();
		this.getNthElementFromLast(k);
		
	}
}
