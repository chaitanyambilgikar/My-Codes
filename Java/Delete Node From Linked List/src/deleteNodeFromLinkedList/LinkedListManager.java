/**
 * @author Chaitanya Bilgikar
 */
package deleteNodeFromLinkedList;

public class LinkedListManager {

	private LinkedListNode head;

	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}

	public void printLinkedList() {
		if (this.getHead() == null) {
			System.out.println("LIST EMPTY");
		} else {
			LinkedListNode currentNode = this.getHead();
			while (currentNode != null) {
				System.out.print(currentNode.getData() + " ");
			}
		}
	}

	public void createLinkedList(int n) {

		for (int i = 0; i < n; i++) {
			LinkedListNode newNode = new LinkedListNode();
			newNode.setData(i + 13);
			if (this.getHead() == null) {
				newNode.setNext(null);
				this.setHead(newNode);
			} else {
				newNode.setNext(this.getHead());
				this.setHead(newNode);
			}
		}
	}

	public void deleteNodeFromLinkedList(LinkedListNode nodeToDelete) {
		if (this.getHead() == null || nodeToDelete == null) {
			System.out
					.println("Either the list is empty or the node to delete does not exist!");
		} else if (nodeToDelete.getNext() == null) {
			/*
			 * Iterate through the entire list until the previous node to the
			 * node to delete and remove it's next link
			 */
			LinkedListNode currentNode = this.getHead();
			while (currentNode.getNext() != nodeToDelete) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(null);
		} else {
			/*
			 * The node to delete has a next node. Copy its contents over to
			 * this node and delete the next node
			 */
			LinkedListNode nextNode = nodeToDelete.getNext();
			nodeToDelete.setData(nextNode.getData());
			nodeToDelete.setNext(nextNode.getNext());
		}
	}

	public LinkedListManager() {

		this.setHead(null);
	}

}
