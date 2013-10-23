/**
 * @author Chaitanya Bilgikar
 */
package partitionLinkedListAroundAValue;

public class LinkedListManager {

	private LinkedListNode head;

	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}

	/*
	 * Print any linked list
	 */
	public void printLinkedList(LinkedListNode startNode) {
		if (startNode == null) {
			System.out.println("LIST IS EMPTY");
		} else {
			LinkedListNode currentNode = startNode;
			while (currentNode != null) {
				System.out.print(currentNode.getData() + " ");
				currentNode = currentNode.getNext();
			}
		}

	}

	/*
	 * Add an item to the linked list. The head of the linked list is passed as
	 * an argument
	 */
	public LinkedListNode addItemToList(LinkedListNode headNode,
			LinkedListNode currentNode) {
		if (headNode == null) {
			headNode = currentNode;

		} else {
			currentNode.setNext(headNode);
			headNode = currentNode;

		}
		return headNode;

	}

	/*
	 * Method to create the initial list
	 */
	public void createLinkedList(int n) {
		for (int i = 0; i < n; i++) {
			LinkedListNode currentNode = new LinkedListNode();

			currentNode.setData(i + 10);
			this.setHead(this.addItemToList(this.getHead(), currentNode));

		}
	}

	public LinkedListManager() {

		this.setHead(null);
	}
}
