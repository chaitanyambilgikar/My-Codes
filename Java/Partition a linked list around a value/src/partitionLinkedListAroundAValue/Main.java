package partitionLinkedListAroundAValue;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedListManager linkedListManager = new LinkedListManager();
		linkedListManager.createLinkedList(10);
		linkedListManager.printLinkedList(linkedListManager.getHead());
	}

}
