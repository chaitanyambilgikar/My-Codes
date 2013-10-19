/**
 * @author Chaitanya Bilgikar
 */
package removeDuplicatesFromLinkedList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListManager {
	
	private LinkedList<Integer> linkedList;
	private HashMap<Integer, Integer>uniqueTable;
	private LinkedList<Integer> duplicateFreeLinkedList;

	public LinkedList<Integer> getDuplicateFreeLinkedList() {
		return duplicateFreeLinkedList;
	}

	public void setDuplicateFreeLinkedList(
			LinkedList<Integer> duplicateFreeLinkedList) {
		this.duplicateFreeLinkedList = duplicateFreeLinkedList;
	}

	public HashMap<Integer, Integer> getUniqueTable() {
		return uniqueTable;
	}

	public void setUniqueTable(HashMap<Integer, Integer> uniqueTable) {
		this.uniqueTable = uniqueTable;
	}

	public LinkedList<Integer> getLinkedList() {
		return linkedList;
	}

	public void setLinkedList(LinkedList<Integer> linkedList) {
		this.linkedList = linkedList;
	}

	/*
	 * Method to create the linked list. Takes the size of the linked list (n) as the parameter
	 */
	public void createLinkedList(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(i==0||i==1)
			{
				this.getLinkedList().add(i);
			}
			else
			{
				this.getLinkedList().add((i-1)+(i-2));
			}
		}
	}
	/*
	 * Method to print the linked list that we have
	 */
	public void printLinkedList(LinkedList<Integer> linkedList)
	{
		Iterator<Integer> it = linkedList.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
	
	/*
	 * Create a hash table on the fly and check for duplicates
	 */
	public void removeDuplicates()
	{
		Iterator<Integer> it = this.getLinkedList().iterator();
		while(it.hasNext())
		{
			int currentNumber = (Integer) it.next();

			if(this.getUniqueTable().containsKey(currentNumber))
			{
				//this.getLinkedList().remove(currentNumber);
			}
			else
			{
				this.getUniqueTable().put(currentNumber, 1);
				this.getDuplicateFreeLinkedList().add(currentNumber);
				
			}
		}
	}
	
	/*
	 * Constructor. Creates the linked list and initializes the hash table. Takes the size of the 
	 * linked list as a paramenter
	 */
	public LinkedListManager(int n) {
		
		this.setLinkedList(new LinkedList<Integer>());
		this.setDuplicateFreeLinkedList(new LinkedList<Integer>());
		this.setUniqueTable(new HashMap<Integer, Integer>());
		this.createLinkedList(n);
		this.printLinkedList(this.getLinkedList());
		this.removeDuplicates();
		this.printLinkedList(this.getDuplicateFreeLinkedList());
	}
}

