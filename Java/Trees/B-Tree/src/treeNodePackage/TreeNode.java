package treeNodePackage;

public class TreeNode {
	
	private int data;
	private int position;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private TreeNode parent;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	public TreeNode getParent() {
		return parent;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	
	public TreeNode(int data,int position)
	{
		this.setLeftChild(null);
		this.setRightChild(null);
		this.setParent(null);
		this.setData(data);
		this.setPosition(position);
	}
	public TreeNode() {
		
		this.setLeftChild(null);
		this.setRightChild(null);
		this.setParent(null);
	}
	

}
