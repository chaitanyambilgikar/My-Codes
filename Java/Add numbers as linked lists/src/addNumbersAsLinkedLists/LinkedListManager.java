package addNumbersAsLinkedLists;

public class LinkedListManager {

	private LinkedListNode listHead;

	public LinkedListNode getListHead() {
		return listHead;
	}

	public void setListHead(LinkedListNode listHead) {
		this.listHead = listHead;
	}

	public LinkedListNode addItemToList(LinkedListNode head, int value) {
		LinkedListNode newNode = new LinkedListNode();
		newNode.setData(value);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		return head;
	}

	public void printLinkedList(LinkedListNode head) {
		if (head == null) {
			System.out.println("Empty List!");
		} else {
			LinkedListNode currentNode = head;
			while (currentNode != null) {
				System.out.print(currentNode.getData() + " ");
				currentNode = currentNode.getNext();
			}
		}
		System.out.println();
	}

	public LinkedListManager() {
		// TODO Auto-generated constructor stub
		this.setListHead(null);
	}

}
