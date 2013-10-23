package treeNodePackage;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		TreeNode node = new TreeNode(5, 0);
		TreeNode node1 = new TreeNode(4, 0);
		TreeNode node2 = new TreeNode(6, 0);
		tree = tree.insert(tree, node);
		tree = tree.insert(tree, node1);
		tree = tree.insert(tree, node2);
		Traversals traverser = new Traversals();
		traverser.inOrderTraversal(tree.getRoot());
		traverser.preOrderTraversal(tree.getRoot());
		traverser.postOrderTraversal(tree.getRoot());
	}

}
