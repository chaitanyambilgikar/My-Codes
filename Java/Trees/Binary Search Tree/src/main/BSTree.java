package main;

import java.util.Random;

public class BSTree {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	/**
	 * @param args
	 */
	/**
	 * 
	 * @param node
	 *            Prints the nodes of the tree in an in-order traversal
	 */
	public void inOrderTreeWalk(Node node) {
		if (node != null) {
			inOrderTreeWalk(node.getLeft());
			System.out.print(node.getData() + " ");
			inOrderTreeWalk(node.getRight());
		}
	}

	/**
	 * 
	 * @param node
	 *            Prints the nodes of the tree in a pre-order traversal
	 */
	public void preOrderTreeWalk(Node node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			preOrderTreeWalk(node.getLeft());
			preOrderTreeWalk(node.getRight());
		}
	}

	/**
	 * 
	 * @param node
	 *            Prints the nodes of the tree in a post-order traversal
	 */
	public void postOrderTreeWalk(Node node) {
		if (node != null) {
			postOrderTreeWalk(node.getLeft());
			postOrderTreeWalk(node.getRight());
			System.out.println(node.getData() + " ");
		}
	}

	/**
	 * 
	 * @param node
	 * @return the node with the minimum value in the subtree rooted at node
	 */
	public Node treeMinimum(Node node) {
		while (node.getLeft() != null) {
			node = node.getLeft();
		}
		return node;
	}

	/**
	 * 
	 * @param node
	 * @return the node with the maximum value in the subtree rooted at node
	 */
	public Node treeMaximum(Node node) {
		while (node.getRight() != null) {
			node = node.getRight();
		}
		return node;
	}

	/**
	 * 
	 * @param node
	 * @return successor of node in the tree
	 */
	public Node treeSuccessor(Node node) {
		if (node.getRight() != null) {
			return treeMinimum(node);
		} else {
			Node y = node.getParent();
			while (y != null && node == y.getRight()) {
				node = y;
				y = y.getParent();
			}
			return y;
		}
	}

	/**
	 * 
	 * @param root
	 * @param z
	 *            Insert a new node into the tree at its correct position
	 */
	public void treeInsert(Node root, Node z) {
		Node y = new Node();
		Node x = new Node();
		x = getRoot();
		while (x != null) {
			y = x;
			if (z.getData() < x.getData()) {
				x = x.getLeft();
			} else {
				x = x.getRight();
			}
		}
		z.setParent(y);
		if (getRoot() == null) {
			setRoot(z);
		}
		if (z.getData() < y.getData()) {
			y.setLeft(z);

		} else {
			y.setRight(z);
		}
	}
	public void transplant(Node root,Node u, Node v)
	{
		if(u.getParent() == null)
		{
			setRoot(v);
		}
	}
	public BSTree() {
		// TODO Auto-generated constructor stub
		setRoot(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTree tree = new BSTree();
		Random gen = new Random();
		for (int i = 0; i < 10; i++) {
			Node newNode = new Node(gen.nextInt(50), null, null, null);
			tree.treeInsert(tree.getRoot(), newNode);
		}
		tree.inOrderTreeWalk(tree.getRoot());
	}

}
