package main;
/**
 * 
 * @author chaitanya
 *	This class defines the structure of any node int the BST
 *and all the operations that can be performed on the data
 *in the node.
 */
public class Node {
	
	private int data;
	private Node left;
	private Node right;
	private Node parent;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public Node(int data, Node left, Node right, Node parent)
	{
		setData(data);
		setLeft(left);
		setRight(right);
		setParent(parent);
	}
	public Node() {
		setData(0);
		setLeft(null);
		setRight(null);
		setParent(null);
	}

}
