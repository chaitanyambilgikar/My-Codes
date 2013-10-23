package addNumbersAsLinkedLists;

public class NumberManager {

	private LinkedListManager firstNumberManager;
	private LinkedListManager secondNumberManager;
	private int firstNumber;
	private int secondNumber;

	private LinkedListManager sumManager;
	private int sum;

	public LinkedListManager getFirstNumberManager() {
		return firstNumberManager;
	}

	public void setFirstNumberManager(LinkedListManager firstNumberManager) {
		this.firstNumberManager = firstNumberManager;
	}

	public LinkedListManager getSecondNumberManager() {
		return secondNumberManager;
	}

	public void setSecondNumberManager(LinkedListManager secondNumberManager) {
		this.secondNumberManager = secondNumberManager;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public LinkedListManager getSumManager() {
		return sumManager;
	}

	public void setSumManager(LinkedListManager sumManager) {
		this.sumManager = sumManager;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void initLinkedLists() {
		this.getFirstNumberManager().setListHead(
				this.getFirstNumberManager().addItemToList(
						this.getFirstNumberManager().getListHead(), 6));
		this.getFirstNumberManager().setListHead(
				this.getFirstNumberManager().addItemToList(
						this.getFirstNumberManager().getListHead(), 1));
		this.getFirstNumberManager().setListHead(
				this.getFirstNumberManager().addItemToList(
						this.getFirstNumberManager().getListHead(), 7));

		this.getSecondNumberManager().setListHead(
				this.getSecondNumberManager().addItemToList(
						this.getSecondNumberManager().getListHead(), 2));
		this.getSecondNumberManager().setListHead(
				this.getSecondNumberManager().addItemToList(
						this.getSecondNumberManager().getListHead(), 9));
		this.getSecondNumberManager().setListHead(
				this.getSecondNumberManager().addItemToList(
						this.getSecondNumberManager().getListHead(), 5));

		this.getFirstNumberManager().printLinkedList(
				this.getFirstNumberManager().getListHead());
		this.getSecondNumberManager().printLinkedList(
				this.getSecondNumberManager().getListHead());

	}

	public int getNumberFromLinkedList(LinkedListManager linkedList) {
		LinkedListNode listHead = linkedList.getListHead();
		if (listHead == null) {
			System.out.println("Empty List");
			return -1;
		} else {
			int numberToReturn = 0;
			LinkedListNode currentNode = listHead;
			for (int i = 0; currentNode != null; i++, currentNode = currentNode
					.getNext()) {
				int tempNumber = currentNode.getData() * (int) Math.pow(10, i);
				numberToReturn += tempNumber;
			}
			return numberToReturn;
		}
	}

	public LinkedListManager convertToLinkedList(int number,
			LinkedListManager linkedList) {
		while (number > 0) {
			int lastDigit = number % 10;
			linkedList.setListHead(linkedList.addItemToList(
					linkedList.getListHead(), lastDigit));
			number /= 10;
		}
		return linkedList;
	}

	public void addTheNumbers() {
		this.setFirstNumber(this.getNumberFromLinkedList(this
				.getFirstNumberManager()));
		this.setSecondNumber(this.getNumberFromLinkedList(this
				.getSecondNumberManager()));
		int tempSum = this.getFirstNumber() + this.getSecondNumber();
		this.setSumManager(this.convertToLinkedList(tempSum,
				this.getSumManager()));
		this.setSum(this.getNumberFromLinkedList(this.getSumManager()));
		this.getSumManager()
				.printLinkedList(this.getSumManager().getListHead());
	}

	public NumberManager() {
		// TODO Auto-generated constructor stub
		this.setFirstNumberManager(new LinkedListManager());
		this.setSecondNumberManager(new LinkedListManager());
		this.setSumManager(new LinkedListManager());
	}
}
